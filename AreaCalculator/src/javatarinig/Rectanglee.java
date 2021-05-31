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
public class Rectanglee implements Shape{

    int width;
    int hight;
    Double area;

    public Rectanglee(int width, int hight) {
        this.width = width;
        this.hight = hight;
        //this.area = area;
    }

    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        hight = sc.nextInt();
    }

    @Override
    public Double area() {
        area = (double)(width*hight); // why ??????
        //System.out.println(area);
        return area;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    
    
}
