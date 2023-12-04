package ClassesPackage;

public class Person {
    private String nameSurname="";
    private int age=0;
    private String country="";
    private String city="";
    private String address="";
    public Person(){ }
    public Person(String name){
        this.nameSurname=name;
    }
    public Person(String name,int age){
        this.nameSurname=name;
        this.age=age;
    }
    public Person(String name,int age, String country, String city, String address){
        this(name,age);
        this.country=country;
        this.city=city;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameSurname='" + nameSurname + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void printPerson(){
        String outString= "ФИО: " + getNameSurname() + "\n" + "Возраст: " + getAge() + "\n";
        if( !this.country.isEmpty()){
            outString += "Страна: " + getCountry() + "\n";
        }
        if( !this.city.isEmpty()){
            outString += "Город: " + getCity() + "\n";
        }
        if( !this.address.isEmpty()){
            outString += "Адрес: " + getAddress() + "\n";
        }
        System.out.println(outString);
    }

}
