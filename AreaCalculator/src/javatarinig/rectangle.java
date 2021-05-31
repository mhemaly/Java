/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatarinig;

/**
 *
 * @author MHemaly
 */
public class rectangle {
    Double width ;
    Double hight ;

    public rectangle(Double width, Double hight) {
        this.width = width;
        this.hight = hight;
    }


    
    public double area(){
      
        return  width*hight;
    
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHight() {
        return hight;
    }

    public void setHight(Double hight) {
        this.hight = hight;
    }
    
    
    
}
