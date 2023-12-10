package Bank;

import Bank.MyExeptions.MinSummToGiveExeption;
import Bank.MyExeptions.OutOfMaxSummOfMoneyBoxExeption;
import Bank.MyExeptions.OutOfMinSummOfMoneyBoxExeption;

import java.util.ArrayList;
import java.util.List;

public class ATM {
public List<MonyeBox> moneyBoxes = new ArrayList<>();

   public int minSummOut;
   public int maxCountOut;
 public int currentSumm;

   public ATM( int minSummOut, int maxSummOut) {

      this.minSummOut = minSummOut;
      this.maxCountOut = maxSummOut;
   }
   private void countCurrentSumm(){
      int res = 0;
      for (var m :moneyBoxes ) {
         res += (m.getCount()*m.getNominal());
      }
      currentSumm = res;
   }
   public void addMoneyBox(int n1,int n2, int n3){
      MonyeBox m=new MonyeBox(n1,n2,n3);
      moneyBoxes.add(m);
   }

   public void minusCount(int n1, MonyeBox mb) {
      int newCount = mb.getCount()-n1;
      if(newCount < 0 ){
         throw new OutOfMinSummOfMoneyBoxExeption();
      }
      else{
         mb.setCount(newCount);
      }
   }
   public void plusCount(int n1, MonyeBox mb) {
      int newCount = mb.getCount()+n1;
      if(newCount < mb.getMaxCount() ){
         throw new OutOfMaxSummOfMoneyBoxExeption();
      }
      else{
         mb.setCount(newCount);
      }
   }
   public void giveOutMoney(int n){
      int count=0;
      if( n < minSummOut){
         throw new MinSummToGiveExeption(minSummOut);
      }

   }
}
