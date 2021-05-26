/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author MHemaly
 */
public class CountryCityMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String path = "city.csv";
    int coutcode = 50010;
//Scanner sc =new Scanner(System.in);
        //String s = sc.nextLine();
    CountryCityDAO cd = new CountryCityDAO();
    cd.ReadCSVFiles(path);
//      
//    for (City C : cd.CityList){
//        String name=C.getName();
//        String code =C.getCode();
//        String continent=C.getContinent();
//        float area = C.getArea();
//        int population = C.getPopulation();
//        String Country_code= C.getCountry_code();
//        //cd.CityList.sort(code);
//        
//        
//       // System.out.println(name + " "+code+" "+continent+" "+area+" "+population+" "+Country_code);
//        
//    }
    
    
    cd.Search(coutcode, path);
    
    for (City C : cd.Search(coutcode, path)){
        String name=C.getName();
        //String code =C.getCode();
        //String continent=C.getContinent();
        //float area = C.getArea();
        int population = C.getPopulation();
        String Country_code= C.getCountry_code();
        //cd.CityList.sort(code);
        
        
//       System.out.println(name + " "+code+" "+continent+" "+area+" "+population+" "+Country_code);
  System.out.println(name + "  "+population+" "+Country_code);      
    }
    
    
    
    
    
    
    
    
    
        
        
        
    }
        
    }
