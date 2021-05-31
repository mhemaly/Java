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
public class Circle implements Shape{
   
   Double rsquare ;
   Double area;
   Double pi = Math.PI;

    public Circle(Double rsquare) {
        this.rsquare = rsquare;
    }
   
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        rsquare=Math.pow(r1, 2);
        
        
    }

   @Override
    public Double area() {
       area = pi * rsquare ;
       return area;
    }



    public Double getRsquare() {
        return rsquare;
    }

    public void setRsquare(Double rsquare) {
        this.rsquare = rsquare;
    }

    
    public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }
    
}
