package ExtendsClassesPackage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Human> list = new ArrayList<Human>();
        Builder builder= new Builder("Иван Иванов");
        list.add(builder);
        Sailor sailor=new Sailor("Петр Петров");
        list.add(sailor);
        Pilot pilot =new Pilot("Сергей Сергеев");
        list.add(pilot);
        for(var l:list){
            System.out.println(l.myName());
            System.out.println(l.work());
        }

        List<Animal> list2 = new ArrayList<Animal>();
        Crocodile croc= new Crocodile("Крокодил", 480);
        list2.add(croc);
        Tiger tiger=new Tiger("Тигр", 120);
        list2.add(tiger);
        Kangarro kang =new Kangarro("Кенгуру",38.5);
        list2.add(kang);
        for(var l:list2){
            l.print();
        }
    }
}
