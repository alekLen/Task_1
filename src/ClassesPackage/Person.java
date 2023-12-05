package ClassesPackage;

import java.util.Scanner;

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
       if(age>0 && age <=99) {
           this.age = age;
       } else {
           this.age = 0;
       }
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
    public void putData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО:");
        nameSurname=scanner.nextLine();

        System.out.println("Введите страну проживания:");
        country=scanner.nextLine();

        System.out.println("Введите город проживания:");
        city=scanner.nextLine();

        System.out.println("Введите адрес:");
        address = scanner.nextLine();

        System.out.println("Введите возраст:");
        boolean check=true;
        do{
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if(number>0 && number<99){
                    age=number;
                    check = false;
                }
            }  else{
                System.out.println("Не корректный возраст");
                scanner.next();
            }
        }while(check);
    }
    public void putData(String name,int age, String country, String city, String address){
        nameSurname = name;
        this.age = age;
        this.country = country;
        this.city = city;
        this.address = address;
    }
    public void printPerson() {
        if (!nameSurname.isEmpty()) {
            String outString = "ФИО: " + nameSurname + "\n";
            if (age != 0) {
                outString += "Возраст: " + age + "\n";
            }
            if (!country.isEmpty()) {
                outString += "Страна: " + country + "\n";
            }
            if (!city.isEmpty()) {
                outString += "Город: " + city + "\n";
            }
            if (!address.isEmpty()) {
                outString += "Адрес: " + address + "\n";
            }
            System.out.println(outString);
        }
    }

}
