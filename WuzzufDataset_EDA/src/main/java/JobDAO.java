

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class JobDAO
{
    List<Job> Joblist;
    String filePath;
    public JobDAO (){
        Joblist=new ArrayList<>();
        //this.filePath=path;
    }
    
    
    
    public ArrayList<String> ReadCSVFiles (String filePath){
        ArrayList<String> CSVData = new ArrayList<String>();
        File f = new File(filePath);
        List<String> lines = new ArrayList<String>();
        // Reading 
        try { lines= Files.readAllLines(f.toPath()); }
        catch (IOException ex) { System.out.println("Faild to read File"+ ex);}
        
        
          for (int row =1 ; row< lines.size(); row++){
            String line = lines.get(row);
            String [] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)",-1); /// split rows to have colums
             
            for (int colum =0 ; colum <fields.length ; colum ++){
                fields[colum] = fields[colum].trim(); // to trim spaces in colums
                if(fields[colum].isEmpty()){
                    fields[colum]="0"; //Handling null columns
                                            }  
             }
            /*/////
            Job job = new Job();
            job.setTitle(fields[0]);
            job.setCompany(fields[1]);
            job.setLocation(fields[2]);
            job.setType(fields[3]);
            job.setLevel(fields[4]);
            job.setExperience(fields[5]);
            job.setCountry(fields[6]);
            job.setSkillsList(fields[7]);
            
            ////*/
            Job j = new Job(fields[0], fields[1], fields[2],fields[3],fields[4],fields[5],fields[6],fields[7]);
            Joblist.add(j);
          }
        
        
        
        return CSVData;
    
    }

}
