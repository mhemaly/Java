/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iti.ai.g2.titanicxchart;


import java.awt.Color;
import java.util.stream.Collector;
import joinery.DataFrame;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.NumberColumn;
import tech.tablesaw.api.StringColumn;
import tech.tablesaw.api.Table;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.knowm.xchart.style.Styler;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
/**
 *
 * @author MHemaly
 */
public class main {
    String titanicCsvPath = "src/main/resources/data/titanic.csv";
    String hrCsvPath = "src/main/resources/data/HR_comma_sep2.csv";
    String titanicjson = "src/main/resources/data/titanic_csv.json";
   public static void main(String[] args) {
        main taitanicxChart = new main();
        System.out.println("========== titanic servival dataset Xchart==========");
        System.out.println("==========gettin data Using TableSaw========");
        taitanicxChart.getPassengersDataUsingTableSaw();
        //System.out.println("==========gettin dataUsing Joinary===========");
        //taitanicxChart.getPassengersDataUsingJoinery();
        System.out.println("=====================Join DataFrames=======================");
        taitanicxChart.joinDataFrames();
        System.out.println("=====================taitanicxChart=======================");
        List<TitanicPassenger> allPassengers = taitanicxChart.getPassengersFromJsonFile ();
        taitanicxChart.graphPassengerAges (allPassengers);
        try {
            System.in.read();
        } catch (IOException ex) {
           
        }
        taitanicxChart.graphPassengerClass (allPassengers);
    }
   
   public List<TitanicPassenger> getPassengersFromJsonFile() {
        List<TitanicPassenger> allPassengersjs = new ArrayList<TitanicPassenger> ();
        ObjectMapper objectMapper = new ObjectMapper ();
        objectMapper.configure (DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try (InputStream input = new FileInputStream (titanicjson)) {
            //Read JSON file
            allPassengersjs = objectMapper.readValue (input, new TypeReference<List<TitanicPassenger>> () {
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return allPassengersjs;
    }
   
     
   public List<TitanicPassenger> getPassengersDataUsingTableSaw() {
        List<TitanicPassenger> allPassengersts = new ArrayList<TitanicPassenger>();
        try {
            Table titanicData = Table.read().csv(titanicCsvPath);
            System.out.println("getDataSummary : " + this.getDataSummary(titanicData));
            System.out.println("getDataInfoStructure : " + this.getDataInfoStructure(titanicData));
            mapTextColumnToNumber(titanicData);
            System.out.println("getDataSummary : " + this.getDataSummary(titanicData));
            System.out.println("getDataInfoStructure : " + this.getDataInfoStructure(titanicData));
            System.out.println("shape : " + titanicData.shape());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return allPassengersts;
    }
   
   public List<TitanicPassenger> getPassengersDataUsingJoinery() {
        List<TitanicPassenger> allPassengersj = new ArrayList<>();
        try {
            DataFrame titanicDataFrame = DataFrame.readCsv(titanicCsvPath);
            System.out.println("getDataSummary : " + titanicDataFrame.describe());
            System.out.println("getDataSummary : " + titanicDataFrame.toString());
            System.out.println("titanicDataFrame Max : " + titanicDataFrame.max());
            System.out.println("titanicDataFrame Min : " + titanicDataFrame.min());
            System.out.println("getDataInfoStructure Mean : " + titanicDataFrame.mean());
            System.out.println("getDataInfoStructure Median : " + titanicDataFrame.median());
            System.out.println("getDataInfoStructure Standard Deviation: " + titanicDataFrame.stddev());
            System.out.println("getDataInfoStructure Variance: " + titanicDataFrame.var());
            TitanicPassenger[] cast =(TitanicPassenger[]) titanicDataFrame.cast(TitanicPassenger.class).toArray();
            System.out.println(cast[0].getName());
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return allPassengersj;
    }

    public DataFrame joinDataFrames() {
        DataFrame titanicDataFrame = null;
        DataFrame hrDataFrame = null;
        try {
            titanicDataFrame = DataFrame.readCsv(titanicCsvPath);
            hrDataFrame = DataFrame.readCsv(hrCsvPath);
            titanicDataFrame = titanicDataFrame.join(hrDataFrame);
            System.out.println("getDataSummary : " + titanicDataFrame.describe());
            System.out.println("getDataSummary : " + titanicDataFrame.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return titanicDataFrame;
    }
    
    
        //get Data Summary
    public String getDataSummary(Table data) {
        Table summary = data.summary();
        return summary.toString();
    }

    //get the structure of the data
    public String getDataInfoStructure(Table data) {
        Table dataStructure = data.structure();
        return dataStructure.toString();
    }

    // mapping text data to numeric values on the sex field female=1,male=0 and adding a column named gender
    public Table mapTextColumnToNumber(Table data) {
        NumberColumn mappedGenderColumn;
        StringColumn gender = (StringColumn) data.column("sex");
        List<Number> mappedGenderValues = new ArrayList<>();
        for (String v : gender) {
            if ((v != null) && (v.equals("female"))) {
                mappedGenderValues.add(1);
            } else {
                mappedGenderValues.add(0);
            }
        }
        mappedGenderColumn = DoubleColumn.create("gender", mappedGenderValues);
        data.addColumns(mappedGenderColumn);
        return data;
    }
    
     public void graphPassengerAges(List<TitanicPassenger> passengerList) {
        //filter to get an array of passenger ages
        List<Float> pAges = passengerList.stream ().map (TitanicPassenger::getAge).limit (8).collect (Collectors.toList ());
        List<String> pNames = passengerList.stream ().map (TitanicPassenger::getName).limit (8).collect (Collectors.toList ());
        String[] names = new String[pNames.size ()];
        Float ages[] = new Float[pAges.size ()];
        ages = pAges.toArray (ages);
        names = pNames.toArray (names);
        //Using XCart to graph the Ages
        // Create Chart
        CategoryChart chart = new CategoryChartBuilder ().width (1024).height (768).title ("Age Histogram").xAxisTitle ("Names").yAxisTitle ("Age").build ();
        // Customize Chart
        chart.getStyler ().setLegendPosition (Styler.LegendPosition.InsideNW);
        chart.getStyler ().setHasAnnotations (true);
        chart.getStyler ().setStacked (true);
        // Series
        chart.addSeries ("Passenger's Ages", pNames, pAges);
        // Show it
        new SwingWrapper (chart).displayChart ();
    }
    

    public void graphPassengerClass(List<TitanicPassenger> passengerList) {
        //filter to get a map of passenger class and total number of passengers in each class
        Map<String, Long> result =
                passengerList.stream().collect(
                        Collectors.groupingBy(
                                TitanicPassenger::getPclass, Collectors.counting()
                        )
                );
              
        
        // Create Chart
        PieChart chart = new PieChartBuilder ().width (800).height (600).title (getClass ().getSimpleName ()).build ();
        // Customize Chart
        Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
        chart.getStyler ().setSeriesColors (sliceColors);
        // Series
        chart.addSeries ("First Class", result.get ("1"));
        chart.addSeries ("Second Class", result.get ("2"));
        chart.addSeries ("Third Class", result.get ("3"));
        // Show it
        new SwingWrapper (chart).displayChart ();
    }
    

}
