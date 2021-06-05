/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanicda;

/**
 *
 * @author MHemaly
 */
public class TitanicPassenger {
    private int pclass;
    private int survived;
    private String name;
    private String sex;
    private int age;
    private int sibsp;
    private int parch;
    private String ticket;
    private double fare;
    private String cabin;
    private String embarked;
    private String boat;
    private int body;
    private String home_dest;
    private double gender;

    public TitanicPassenger(String name, String sex, int age, int survived, int pclass, int sibsp, int parch, String ticket, String cabin, double fare, String embarked, String boat, int body, String home_dest, double gender) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.survived = survived;
        this.pclass = pclass;
        this.sibsp = sibsp;
        this.parch = parch;
        this.ticket = ticket;
        this.cabin = cabin;
        this.fare = fare;
        this.embarked = embarked;
        this.boat = boat;
        this.body = body;
        this.home_dest = home_dest;
        this.gender = gender;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the survived
     */
    public int getSurvived() {
        return survived;
    }

    /**
     * @param survived the survived to set
     */
    public void setSurvived(int survived) {
        this.survived = survived;
    }

    /**
     * @return the pclass
     */
    public int getPclass() {
        return pclass;
    }

    /**
     * @param pclass the pclass to set
     */
    public void setPclass(int pclass) {
        this.pclass = pclass;
    }

    /**
     * @return the sibsp
     */
    public int getSibsp() {
        return sibsp;
    }

    /**
     * @param sibsp the sibsp to set
     */
    public void setSibsp(int sibsp) {
        this.sibsp = sibsp;
    }

    /**
     * @return the parch
     */
    public int getParch() {
        return parch;
    }

    /**
     * @param parch the parch to set
     */
    public void setParch(int parch) {
        this.parch = parch;
    }

    /**
     * @return the ticket
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the cabin
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * @param cabin the cabin to set
     */
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    /**
     * @return the fare
     */
    public double getFare() {
        return fare;
    }

    /**
     * @param fare the fare to set
     */
    public void setFare(double fare) {
        this.fare = fare;
    }

    /**
     * @return the embarked
     */
    public String getEmbarked() {
        return embarked;
    }

    /**
     * @param embarked the embarked to set
     */
    public void setEmbarked(String embarked) {
        this.embarked = embarked;
    }

    /**
     * @return the boot
     */
    public String getBoat() {
        return boat;
    }

    /**
     * @param boat the boot to set
     */
    public void setBoot(String boat) {
        this.boat = boat;
    }

    /**
     * @return the body
     */
    public int getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(int body) {
        this.body = body;
    }

    /**
     * @return the home_dest
     */
    public String getHome_dest() {
        return home_dest;
    }

    /**
     * @param home_dest the home_dest to set
     */
    public void setHome_dest(String home_dest) {
        this.home_dest = home_dest;
    }

    /**
     * @return the gender
     */
    public double getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(double gender) {
        this.gender = gender;
    }
    
}
