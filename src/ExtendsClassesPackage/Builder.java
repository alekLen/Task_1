package ExtendsClassesPackage;

public class Builder extends Human{
    private String name="";

    public Builder(String name) {
        super.name=name;
        this.name = name;
    }

    public Builder() {
    }

    public String work(){
        return "Я строю дома!";
    }
    public String getName() {
        super.name=name;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
