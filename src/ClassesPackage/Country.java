package ClassesPackage;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String countryName="";
    private String continentName ="";
    private String capital ="";
    private String phoneCode ="";
    private String numberOfCitizen ="";
    private List<String> cities = new ArrayList<>();
    public Country(){ }
    public Country(String country, String continent, String capital, String number, String phoneCode){
        countryName=country;
        continentName=continent;
        numberOfCitizen=number;
        this.capital=capital;
        this.phoneCode=phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public Country(String country, String continent, String capital){
        countryName=country;
        continentName=continent;
        this.capital=capital;
    }
    public Country(String country,String capital){
        countryName=country;
        this.capital=capital;
    }
    public Country(String country){
        countryName=country;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public String getCapital() {
        return capital;
    }

    public String getNumberOfCitizen() {
        return numberOfCitizen;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setNumberOfCitizen(String numberOfCitizen) {
        this.numberOfCitizen = numberOfCitizen;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
    public void addCity(String name){
        this.cities.add(name);
    }
    public void deleteCity(String name){
        this.cities.remove(name);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", continentName='" + continentName + '\'' +
                ", capital='" + capital + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                ", numberOfCitizen='" + numberOfCitizen + '\'' +
                ", cities=" + cities +
                '}';
    }

    public void print(){
        String outStr="";
        if( !getCountryName().isEmpty()) {
             outStr += "страна: " + getCountryName() + "\n";
        }
        if( !getContinentName().isEmpty()) {
            outStr += "континент: " + getContinentName() + "\n";
        }
        if( !getCapital().isEmpty()) {
            outStr += "столица: " + getCapital() + "\n";
        }
        if( !getNumberOfCitizen().isEmpty()) {
            outStr += "количество жителей: " + getNumberOfCitizen() + "\n";
        }
        if( !getPhoneCode().isEmpty()) {
            outStr += "телефонный код: " + getPhoneCode() + "\n";
        }
        if( !cities.isEmpty()) {
            outStr += "города: " + "\n";;
            for (String city : cities ) {
                outStr += "\t\t" + city + "\n";
            }
        }
        System.out.println(outStr);
    }
}
