package ExtendsClassesPackage;

public class Pilot extends Human{
    private String name="";

    public Pilot(String name) {
        super.name=name;
        this.name = name;
    }

    public Pilot() {
    }
    public String work(){
        return "Я управляю самолетом!";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        super.name=name;
        this.name = name;
    }


}
