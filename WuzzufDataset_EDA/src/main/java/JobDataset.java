
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MHemaly
 */
public class JobDataset {
    
    public static void JobsTitle(List<Job> Jobs){
        int i=0;
        Map<String,Long> Job_Title=new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (Job_Title.containsKey(Jobs.get(i).getTitle())){
                Job_Title.put(Jobs.get(i).getTitle(),Long.valueOf(Job_Title.get(Jobs.get(i).getTitle())+1));
            }else {
                Job_Title.put(Jobs.get(i).getTitle(), 1L);
            }
            i++;
        }
        System.out.println("*******Jop Title*******");
        //System.out.println(Job_Title);
        System.out.println(sortMap(Job_Title));
        System.out.println(" ");
    }   
     public static void JobsCompany(List<Job> Jobs){
        int i=0;
        Map<String,Long> Job_Company=new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (Job_Company.containsKey(Jobs.get(i).getCompany())){
                Job_Company.put(Jobs.get(i).getCompany(),Long.valueOf(Job_Company.get(Jobs.get(i).getCompany())+1));
            }else {
                Job_Company.put(Jobs.get(i).getCompany(), 1L);
            }
            i++;
        }
        System.out.println("*******Jop Title*******");
        //System.out.println(Job_Title);
        System.out.println(sortMap(Job_Company));
        System.out.println(" ");
    }
     public static void JobsCountry(List<Job> Jobs){
        int i=0;
        Map<String,Long> Job_Country =new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (Job_Country.containsKey(Jobs.get(i).getCountry())){
                Job_Country.put(Jobs.get(i).getCountry(),Long.valueOf(Job_Country.get(Jobs.get(i).getCountry())+1));
            }else {
                Job_Country.put(Jobs.get(i).getCountry(), 1L);
            }
            i++;
        }
        System.out.println("*******Location*******");
        System.out.println(sortMap(Job_Country));
        System.out.println(" ");
    }    
     public static void JobsLevel(List<Job> Jobs){
        int i=0;
        Map<String,Long> Job_Level =new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (Job_Level.containsKey(Jobs.get(i).getLevel())){
                Job_Level.put(Jobs.get(i).getLevel(),Long.valueOf(Job_Level.get(Jobs.get(i).getLevel())+1));
            }else {
                Job_Level.put(Jobs.get(i).getLevel(), 1L);
            }
            i++;
        }
        System.out.println("*******Level*******");
        System.out.println(sortMap(Job_Level));
        System.out.println(" ");
    }
     public static void JobsYearsExperiance(List<Job> Jobs){
        int i=0;
        Map<String,Long> Job_YearsExp=new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (Job_YearsExp.containsKey(Jobs.get(i).getExperience())){
                Job_YearsExp.put(Jobs.get(i).getExperience(),Long.valueOf(Job_YearsExp.get(Jobs.get(i).getExperience())+1));
            }else {
                Job_YearsExp.put(Jobs.get(i).getExperience(), 1L);
            }
            i++;
        }
        System.out.println("*******Years Of Experiance*******");
        System.out.println(sortMap(Job_YearsExp));
        System.out.println(" ");
    }
     
     
     
     
     public static LinkedHashMap<String,Long> sortMap(Map<String,Long> map){
        LinkedHashMap<String, Long> sortedMap = map.entrySet().stream()
                //.sorted(Comparator.comparingLong(e -> e.getValue())) // Asc Sorting
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Desc Sorting
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        return sortedMap;
    }
    
}
