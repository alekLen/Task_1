package ClassesPackage;

public class Main {
    public static void main(String[] args) {
        Fraction f1=new Fraction(7,9);
        Fraction f2=new Fraction(3,4);

        Fraction f3=Fraction.summFractions(f1,f2);
        System.out.println(f1 + " + " + f2 + " = " + f3);

        f1.putNumerator(9);
        f1.putDenominator(0);
        f1.printFraction();
        System.out.println();

        Fraction f4=Fraction.substractFractions(f1,f2);
        System.out.println(f1 + " - " + f2 + " = " + f4);


        Fraction f5=Fraction.substractFractions(f2,f1);
        System.out.println(f2 + " - " + f1 + " = " + f5);

        Fraction f6=Fraction.multiplicatFractions(f2,f1);
        System.out.println(f2 + " * " + f1 + " = " + f6);

        Fraction f7=Fraction.devisionFractions(f2,f1);
        System.out.println(f2 + " / " + f1 + " = " + f7);

        Fraction f10=Fraction.devisionFractions(f1,f2);
        System.out.println(f1 + " / " + f2 + " = " + f10);

        Fraction f8=new Fraction(0);
        Fraction f9=Fraction.devisionFractions(f2,f8);
        System.out.println(f2 + " / " + f8 + " = " + f9);

        Fraction f11=new Fraction(1,2);
        Fraction f12=Fraction.devisionFractions(f2,f11);
        System.out.println(f2 + " / " + f11 + " = " + f12);

        Person person1=new Person("Иванов",25);
        System.out.println(person1);
        person1.printPerson();

        person1.setCountry("Украина");
        person1.setCity("Винница");
        person1.setAddress("Соборная,178");
        person1.printPerson();

        Person person2=new Person("Петров",35,"Украина","Киев","бульвар Шевченка, 122");
        person2.printPerson();

        Person person3=new Person();
        person3.putData();
        person3.printPerson();

        Person person4=new Person();
        person4.putData("Сокол",35,"Украина","Полтава","ул. Шевченка, 12");
        person4.printPerson();

        Country country=new Country("Украина");
        country.setContinentName("Евразия");
        country.setCapital("Киев");
        country.setPhoneCode("+380");
        country.addCity("Винница");
        country.addCity("Львов");
        country.addCity("Харьков");
        country.addCity("Варшава");
        country.addCity("Одесса");
        country.addCity("Херсон");
        country.addCity("Житомир");
        country.setNumberOfCitizen("43.79 млн");

        country.print();

        country.deleteCity("Варшава");
        country.print();

        City city=new City();
        city.setCityName("Гайсин");
        city.setCountryName("Украина");
        city.setRegionName("Винницкая");
        city.setPhoneCode("(4334)");
        city.setPostCode("23700");
        city.setNumberOfPeople("26 627");

        city.print();

        Book book = new Book();
        book.setName("Ночь в Лиссабоне");
        book.setAutor("Эрих Мария Ремарк");
        book.setYear(1992);
        book.setGenre("роман");
        book.setProduction("Клуб семейного досуга");
        book.setPictures(574);

        book.print();

        Auto auto=new Auto();
        auto.setName("Жук");
        auto.setProduction("Ниссан");
        auto.setYear(2014);
        auto.setVolume(1590);

        auto.print();
    }
}
