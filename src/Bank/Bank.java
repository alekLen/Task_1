package Bank;

import java.util.ArrayList;
import java.util.List;
import Bank.MonyeBox;

public class Bank {
   private final int countAtms;
    private List<ATM> list= new ArrayList<>();
    public Bank(int number){
        countAtms=number;
    }
public void createAtmType1( int summa,int min,int max,int maxmoneyBoxes){
    ATM atm1 = new ATM(min,max,maxmoneyBoxes);
    atm1.addMoneyBox(500,600,1000);
    atm1.addMoneyBox(200,600,1000);
    atm1.addMoneyBox(100,600,1000);
    atm1.addMoneyBox(50,600,1000);
    list.add(atm1);
}
    public void addAtm( ATM atm){

        list.add(atm);
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
 public void createMoneyBoxesToAtm(ATM atm1,int summa,int maxCount){

 if(maxCount>0&& summa>0) {
     MonyeBox mb1 = new MonyeBox(500, 1, 1000);
     maxCount--;
     if (maxCount != 0) {
         MonyeBox mb2 = new MonyeBox(200, 1, 1000);
     }
     maxCount--;
     if (maxCount != 0) {
         MonyeBox mb3 = new MonyeBox(100, 1, 1000);
     }
     maxCount--;
     if (maxCount != 0) {
         MonyeBox mb4 = new MonyeBox(50, 1, 1000);
     }
     maxCount--;
     if (maxCount != 0) {
         MonyeBox mb5 = new MonyeBox(20, 1, 1000);
     }
     maxCount--;
     if (maxCount != 0) {
         atm1.addMoneyBox(200, 1, 1000);
         atm1.addMoneyBox(100, 1, 1000);
         atm1.addMoneyBox(50, 1, 1000);
     }
 }
 }
}
