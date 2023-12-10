package Bank;

import Bank.MyExeptions.NotCorrectNominalException;
import Bank.MyExeptions.OutOfMaxSummOfMoneyBoxExeption;
import Bank.MyExeptions.OutOfMinSummOfMoneyBoxExeption;

public class MonyeBox {
    private int nominal;
    private int count;
    private int maxCount;
    public MonyeBox(int n1,int n2,int  n3){
        if(n1 ==1 ||n1 ==2 ||n1 ==5 ||n1 ==10 ||n1 ==20 ||
        n1 ==50 ||n1 ==100 ||n1 ==200 ||n1 ==500){
            nominal=n1;
        }else{
           throw new NotCorrectNominalException();
        }
        if(n2 <0 || n2 > n3){
            throw new OutOfMaxSummOfMoneyBoxExeption();
        }else{
            count = n2;
            maxCount = n3;
        }
       }

    public int getCount() {
        return count;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getNominal() {
        return nominal;
    }

    public void setCount(int count) {
        this.count = count;
    }

}


