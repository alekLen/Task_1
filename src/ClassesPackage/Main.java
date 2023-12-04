package ClassesPackage;

public class Main {
    public static void main(String[] args) {
        Fraction f1=new Fraction(9,0);
        Fraction f2=new Fraction(3,4);

        Fraction f3=Fraction.summFractions(f1,f2);
        System.out.println(f1 + " + " + f2 + " = " + f3);


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
    }
}
