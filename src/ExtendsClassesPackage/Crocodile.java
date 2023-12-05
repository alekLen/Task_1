package ExtendsClassesPackage;

public class Crocodile extends Animal {

    public Crocodile(String name, double weight){
         super.name=name;
         super.weight=weight;
    }

    @Override
    protected String go() {
        return "Я могу плавать и бегать";
    }

}
