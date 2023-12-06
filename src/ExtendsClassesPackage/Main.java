package ExtendsClassesPackage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Human> list = new ArrayList<Human>();
//        Builder builder= new Builder("Иван Иванов");
//        list.add(builder);
//        Sailor sailor=new Sailor("Петр Петров");
//        list.add(sailor);
//        Pilot pilot =new Pilot("Сергей Сергеев");
//        list.add(pilot);
//        for(var l:list){
//            System.out.println(l.myName());
//            System.out.println(l.work());
//        }
//
//        List<Animal> list2 = new ArrayList<Animal>();
//        Crocodile croc= new Crocodile("Крокодил", 480);
//        list2.add(croc);
//        Tiger tiger=new Tiger("Тигр", 120);
//        list2.add(tiger);
//        Kangarro kang =new Kangarro("Кенгуру",38.5);
//        list2.add(kang);
//        for(var l:list2){
//            l.print();
//        }

//        Product m=new Product("книга",3,30) ;
//        m.print();
//        m.upPrice(2.80);
//        m.print();
//        m.downPrice(4.875);
//        m.print();

        System.out.println("---------------");
        List<Facility> list= new ArrayList<Facility>();
        Kettle kettle=new Kettle("Bosh","bs3000","1.8l","1200v");
        list.add(kettle);
        Auto auto=new Auto("VW","Toureg","универсал","3.0 V6 TDI");
        list.add(auto);
        Microwave micro =new Microwave("Sumsung","s200kn","30.l","1800v");
        list.add(micro);
       Ship ship = new Ship("Katerina",280);
       list.add(ship);
        for(var l:list){
            l.show();
            l.sound();
            l.desc();
            System.out.println("-------");
        }
    }
}
