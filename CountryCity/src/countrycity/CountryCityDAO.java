/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrycity;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Mhemaly
 */
public class CountryCityDAO {
   String filePath;
   String s ;
   List <City> CityList;     
   List <Country> CountryList; 
   
    public CountryCityDAO() {
        
    
   
   
   CityList = new ArrayList<City>();
   CountryList = new ArrayList<Country>();
    }
    public ArrayList<String> ReadCSVFiles (String filePath){
        
        ArrayList<String> CSVData = new ArrayList<String>();
        File f = new File(filePath);
        List<String> lines = new ArrayList<String>();
        try { 
        lines= Files.readAllLines(f.toPath());
        }
        catch (IOException ex) {
        //Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Faild to read File"+ ex);
             }
     
        for (int row =1 ; row< lines.size(); row++){
            String line = lines.get(row);
            String [] fields = line.split(","); /// split rows to have colums
             
            for (int colum =0 ; colum <fields.length ; colum ++){
                fields[colum] = fields[colum].trim(); // to trim spaces in colums
                if(fields[colum].isEmpty()){
                fields[colum]="0";
           
                 
                 }  
             }
            
            City c = new City(fields[0], fields[1], fields[2],Float.parseFloat(fields[3]),Integer.parseInt(fields[4]),fields[5]);
            CityList.add(c);
            
//            if (fields[5].equalsIgnoreCase(s)){
//            City c1 = new City(fields[0], fields[1], fields[2],Float.parseFloat(fields[3]),Integer.parseInt(fields[4]),fields[5]);
//            CityList.add(c1);
//            //CityList.sort(c1);
//           // ArrayList<String> SortedCityList = new ArrayList<String>();
//            //SortedCityList.sort(Comparator<?String> s);
//            
//           // Collections.sort(CityList,Collections.reverseOrder());
//            ArrayList<String> SortedCityList1 = new ArrayList<String>();
//            SortedCityList1.toString();
//            //SortedCityList1.sort();
//            SortedCityList1.add(fields[0]+ " " + fields[1]+" " + fields[2]+" " +fields[3]+" " +fields[4]+" " +fields[5]);
//            Collections.sort(CityList);
//            while (!SortedCityList1.isEmpty()){
//                
//                System.out.println(SortedCityList1);
//                
////            String name=C.getName();
////            String code =C.getCode();
////            String continent=C.getContinent();
////            float area = C.getArea();
////            int population = C.getPopulation();
////            String Country_code= C.getCountry_code();
////            //cd.CityList.sort(code);
////
////           
//           // System.out.println(name + " "+code+" "+continent+" "+area+" "+population+" "+Country_code);
//              break;
//            }        
//            }
//             
         }
        return (CSVData);
        
    }
    
    
    public ArrayList<City> Search(Integer c,String path){ 
             //if (fields[5].equalsIgnoreCase(s)){
//            City c1 = new City(fields[0], fields[1], fields[2],Float.parseFloat(fields[3]),Integer.parseInt(fields[4]),fields[5]);
//            CityList.add(c1);
//            //CityList.sort(c1);
//           // ArrayList<String> SortedCityList = new ArrayList<String>();
//            //SortedCityList.sort(Comparator<?String> s);
//            
//           // Collections.sort(CityList,Collections.reverseOrder());
//            ArrayList<String> SortedCityList1 = new ArrayList<String>();
//            SortedCityList1.toString();
//            //SortedCityList1.sort();
//            SortedCityList1.add(fields[0]+ " " + fields[1]+" " + fields[2]+" " +fields[3]+" " +fields[4]+" " +fields[5]);
//            Collections.sort(CityList);
//            while (!SortedCityList1.isEmpty()){
//                
//                System.out.println(SortedCityList1);
//                
////            String name=C.getName();
////            String code =C.getCode();
////            String continent=C.getContinent();
////            float area = C.getArea();
////            int population = C.getPopulation();
////            String Country_code= C.getCountry_code();
////            //cd.CityList.sort(code);
////
////           
//           // System.out.println(name + " "+code+" "+continent+" "+area+" "+population+" "+Country_code);
//              break;
//            }        
     
            ReadCSVFiles(path);
            ArrayList<String> SortedCityList = new ArrayList<>( ReadCSVFiles(path)); 
            
            
            Map<Integer,City>sortedCities=new HashMap<>();
            CityList.forEach(city->{
            int population = city.getPopulation();
            sortedCities.put(population, city);
                 });
        
            Map<Integer, City> treeMap = new TreeMap<Integer, City>(
            new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

            });
             treeMap.putAll(sortedCities);
            
             
             ArrayList<City> orderedCoties = new ArrayList<>( treeMap.values());
             return orderedCoties;
            
            

    //return null;
    
    }
    
    
    
    
//    public ArrayList<String> CitySearch(String citycode){
//    return null;
//    
//    }
        
      
     
        
        
    }
    
    

