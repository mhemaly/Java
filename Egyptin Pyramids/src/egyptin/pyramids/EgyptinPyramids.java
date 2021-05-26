/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyptin.pyramids;



/**
 *
 * @author MHemaly
 */
public class EgyptinPyramids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DAO d = new DAO("pyramids.csv");
        //List <Pyramid> = d.setFilePath("pyramids.csv"); 
        for (Pyramid pyram: d.PyramidList){
            String pahro =pyram.getPharaoh();
            String name =pyram.getModern_name();
            String site =pyram.getSite();
            Double hight =pyram.getHeight();
            if (pahro.equals("Menkaure")){
            System.out.println(pahro+" "+name+"  "+site+ " "+hight);
        }}
        
       
        
        }
    }
    

