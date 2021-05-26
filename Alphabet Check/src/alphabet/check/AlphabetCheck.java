/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet.check;

/**
 *
 * @author MHemaly
 */
public class AlphabetCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     isLetterCheckr a = (c)->{
         for(int i=0;i<c.length();i++)
         {
             if(!Character.isLetter(c.charAt(i)))
         return false;
         }         
         return true;
         
     };   
        System.out.println("Test letters : " + a.isLetterCheckr_fun("java"));
    }
    
}
