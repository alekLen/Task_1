package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<ATM> list= new ArrayList<>();

    //при создании банкомата вводиться ограничения: минимальная и максимальная сумма, а также максимальное
    // количество денежных контейнеров в банкомате

    public void createAtm( int minSummOut,int maxSummOut,int maxNumberOfMoneyBoxes){
        ATM atm=new ATM(minSummOut,maxSummOut, maxNumberOfMoneyBoxes);
    }
    public void putMoneyBoxToAtm(ATM atm, int nominal,int count, int maxCount){
        try {
            atm.addMoneyBox(nominal, count, maxCount);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public int CurentSummInAllAtms(){
        int res=0;
        for (var atm:list ) {
            res+=atm.countCurrentSumm();
        }
        return res;
    }
    public int getCountAtm(){
        return list.size();
   }

}
