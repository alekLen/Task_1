package Bank;

public class MonyeBox {
    private int nominal;
    private int current;
    private int maxCount;
    public MonyeBox(int n1,int n2,int  n3){
           nominal=n1;
           current=n2;
           maxCount=n3;
       }

    public int getNominal() {
        return nominal;
    }

    public int getCurrent() {
        return current;
    }

    public int getMax() {
        return maxCount;
    }
}


