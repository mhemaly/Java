

import java.util.ArrayList;
import java.util.List;

public class Job {
String Title;
String Company;
String Location;
String Type;
String Level;
//Integer Experience[];
String Experience;
String Country;

//List<String> SkillsList;
String SkillsList;


    //public Job(String Title, String Company, String Location, String Type, String Level, Integer[] Experience, String Country, List<String> SkillsList) {
      public Job(String Title, String Company, String Location, String Type, String Level, String Experience, String Country, String SkillsList) {  
        this.Title = Title;
        this.Company = Company;
        this.Location = Location;
        this.Type = Type;
        this.Level = Level;
        this.Experience = Experience;
        this.Country = Country;
        this.SkillsList = SkillsList;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String Experience) {
        this.Experience = Experience;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getSkillsList() {
        return SkillsList;
    }

    public void setSkillsList(String SkillsList) {
        this.SkillsList = SkillsList;
    }


  

}
