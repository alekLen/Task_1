package ClassesPackage;

public class Auto {
    private String name = "";
    private String production = "";
    private int year = 0;
    private int volume = 0;

    public Auto(String name) {
        this.name = name;
    }

    public Auto(String name, String production) {
        this.name = name;
        this.production = production;
    }

    public Auto(String name, String production, int year) {
        this.name = name;
        this.production = production;
        this.year = year;
    }

    public Auto(String name, String production, int year, int volume) {
        this.name = name;
        this.production = production;
        this.year = year;
        this.volume = volume;
    }

    public Auto() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public String getProduction() {
        return production;
    }

    public int getYear() {
        return year;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", production='" + production + '\'' +
                ", year=" + year +
                ", volume=" + volume +
                '}';
    }
    public void print(){
        String outStr="";
        if( !getProduction().isEmpty()) {
            outStr += "производитель: " + getProduction() + "\n";
        }
        if( !getName().isEmpty()) {
            outStr += "модель автомобиля: " + getName() + "\n";
        }
        if( getYear() != 0) {
            outStr += "год: " + getYear() + "\n";
        }
        if( getVolume() != 0) {
            outStr += "объем двигателя: " + getVolume() + "куб.см" + "\n";
        }

        System.out.println(outStr);
    }

    public static void main(String[] args) {
        Auto auto=new Auto();
        auto.setName("Жук");
        auto.setProduction("Ниссан");
        auto.setYear(2014);
        auto.setVolume(1590);

        auto.print();
    }
}
