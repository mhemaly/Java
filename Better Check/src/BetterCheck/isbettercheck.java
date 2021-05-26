/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetterCheck;

import java.util.function.BiPredicate;

/**
 *
 * @author Mhemaly
 */
public class isbettercheck {
    public static String betterStringFunction(String txt1,String txt2,BiPredicate<String, String> b){
        if (b.test(txt1, txt2)) 
            return txt1;
        else
            return txt2;
    }
}
