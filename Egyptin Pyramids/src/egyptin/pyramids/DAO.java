/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyptin.pyramids;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MHemaly
 */
public class DAO {
 String filePath;
 List <Pyramid> PyramidList;
    public DAO(String filePath) {
    
         this.filePath = filePath;
         
         
         PyramidList = new ArrayList<Pyramid>();
         
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
             Pyramid p = new Pyramid(fields[0], fields[2], fields[4],Double.parseDouble(fields[7]));
             //System.out.println(p.pharaoh+" "+p.modern_name+" "+p.site+" "+p.height);
             PyramidList.add(p);
         }
     }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<Pyramid> getPyramidList() {
        return PyramidList;
    }

    public void setPyramidList(List<Pyramid> PyramidList) {
        this.PyramidList = PyramidList;
    }
    
}
    
      
          
            
            
        
            
        
        
        
        
    

