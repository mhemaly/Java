/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanicda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import joinery.DataFrame;

/**
 *
 * @author MHemaly
 */
public class JoinaryDataFrame {
    String titanicCsvPath = "src/main/resources/titanic.csv";
    String vgsalesCsvPath = "src/main/resources/vgsales.csv";
    public static void main(String args[]){
        JoinaryDataFrame main = new JoinaryDataFrame();
        try {
            
           System.out.println ("=================:df1:==================");
            DataFrame<Object>  df1= DataFrame.readCsv ("src/main/resources/data/vgsales.csv")
                    .retain("Year", "NA_Sales");
                    //.describe ();
           System.out.println (df1.toString ());
            System.out.println ("=========================================================================================");
            System.out.println ("=================:df2:==================");
            DataFrame<Object>  df2= DataFrame.readCsv ("src/main/resources/data/vgsales.csv")
                    .retain("EU_Sales","JP_Sales")
                    .groupBy(row ->row.get(1));
                    //.mean ();
            System.out.println (df2.toString ());
            //df2.iterrows ().forEachRemaining (System.out::println);

            //System.out.println ("=========================================================================================");
            
            System.out.println ("=========================================================================================");
            System.out.println ("=================:dfjoin:==================");
            
        //Joining 2 datafreams
        /*Return new data fram with left join of two dataframs*/
        DataFrame<Object>  df3 = new DataFrame<>();
        
        //df1colum1.add(df1.col(0));
        List<Object> Year = df1.col("Year");
        List<Object> NA_Sales = df1.col("NA_Sales");
        List<Object> EU_Sales = df2.col("EU_Sales");
        List<Object> JP_Sales = df2.col("JP_Sales");
        
        
        df3.add("Year",Year);
        df3.add("NA_Sales",NA_Sales);
        df3.add("EU_Sales",EU_Sales);
        df3.add("JP_Sales",JP_Sales);
        
        
        System.out.println ("================= :: df3 Columns ::================");
        //dfjoin.iterrows().forEachRemaining(System.out::println);
        //System.out.println(dfjoin.describe().toString());
        System.out.println(df3.columns());
        System.out.println ("================= :: df3 head (first 5 rows) ::================");
        //df3.iterrows().forEachRemaining(System.out::println);
        System.out.println(df3.head(5));
        System.out.println ("================= :: df3 description (count , mean ,std,min,max for each column)::================");
        System.out.println(df3.describe());
        System.out.println ("================= :: df3 tail (last 5 rows) ::================");
        System.out.println(df3.tail(5));
        
        main.getPassengersDataUsingJoinery();
        // Merging 2 data frams
        
        } catch (IOException e) {
        }
    }
    public List<TitanicPassenger> getPassengersDataUsingJoinery() {
        List<TitanicPassenger> allPassengers = new ArrayList<>();
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
        return allPassengers;
    }
}
