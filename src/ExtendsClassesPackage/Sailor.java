package ExtendsClassesPackage;

public class Sailor extends Human{
    private String name="";

    public Sailor(String name) {
        super.name=name;
        this.name = name;
    }

    public Sailor() {
    }
    public String work(){
        return "Я продавец!";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        super.name=name;
        this.name = name;
    }


}

