/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrycity;

import java.util.ArrayList;

/**
 *
 * @author MHemaly
 */
public class Country {
    private String Country_Name;
    private String Country_code;
    private ArrayList<City> city_list;

    public Country(String Country_Name, String Country_code, ArrayList<City> city_list) {
        this.Country_Name = Country_Name;
        this.Country_code = Country_code;
        this.city_list = city_list;
    }

    

    public String getCountry_Name() {
        return Country_Name;
    }

    public void setCountry_Name(String Country_Name) {
        this.Country_Name = Country_Name;
    }

    public String getCountry_code() {
        return Country_code;
    }

    public void setCountry_code(String Country_code) {
        this.Country_code = Country_code;
    }

    public ArrayList<City> getCity_list() {
        return city_list;
    }

    public void setCity_list(ArrayList<City> city_list) {
        this.city_list = city_list;
    }
    
    
    
}
