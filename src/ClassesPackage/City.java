package ClassesPackage;

public class City {
    private String cityName ="";
    private String countryName ="";
    private String regionName ="";
    private String numberOfPeople ="";
    private String postCode ="";
    private String phoneCode ="";

    public City(String cityName, String countryName, String regionName, String numberOfPeople, String postCode, String phoneCode) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.regionName = regionName;
        this.numberOfPeople = numberOfPeople;
        this.postCode = postCode;
        this.phoneCode = phoneCode;
    }

    public City() {
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setNumberOfPeople(String numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", numberOfPeople='" + numberOfPeople + '\'' +
                ", postCode='" + postCode + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                '}';
    }
     public void print(){
         String outStr="";
         if( !getCityName().isEmpty()) {
             outStr += "город: " + getCityName() + "\n";
         }
         if( !getRegionName().isEmpty()) {
             outStr += "область: " + getRegionName() + "\n";
         }
         if( !getCountryName().isEmpty()) {
             outStr += "страна: " + getCountryName() + "\n";
         }
         if( !getNumberOfPeople().isEmpty()) {
             outStr += "количество жителей города: " + getNumberOfPeople() + "\n";
         }
         if( !getPhoneCode().isEmpty()) {
             outStr += "телефонный код: " + getPhoneCode() + "\n";
         }
         if( !getPostCode().isEmpty()) {
             outStr += "почтовый индекс: " + getPostCode() + "\n";
         }

         System.out.println(outStr);
     }
}
