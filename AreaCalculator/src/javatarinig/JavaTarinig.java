/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatarinig;

import java.util.Scanner;

/**
 *
 * @author MHemaly
 */
public class JavaTarinig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* rectangle r =new rectangle(10.0,7.0);
        
        //double b = r.area();
       
        System.out.println(r.area());*/
        
       /* calculate regtangular area 
       Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
       Rectanglee rec = new Rectanglee(w,h);
       rec.area();*/
       
       /* calculate Circule area*/
       Scanner sc = new Scanner(System.in);
        Double w = sc.nextDouble();
        Circle c =new Circle(w);
        //c.area();
        System.out.println(c.area());
       
       /**/
    }
    
}
