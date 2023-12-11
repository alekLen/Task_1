package Bank;

import Bank.MyExeptions.AtmIsAlreadyFullOfMoneyBoxes;
import Bank.MyExeptions.MinSummToGiveExeption;
import Bank.MyExeptions.NotInafMoneyInBox;
import Bank.MyExeptions.OutOfMaxSummOfMoneyBoxExeption;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
public List<MonyeBox> moneyBoxes = new ArrayList<>();

   private final int minSummOut;
   private final int maxCountOut;
   private final int maxNumberMoneyBoxes;

   private int currentSumm = 0;

   public ATM( int minSummOut, int maxSummOut,int maxNumberMoneyBoxes) {

      this.minSummOut = minSummOut;
      this.maxCountOut = maxSummOut;
       this.maxNumberMoneyBoxes=maxNumberMoneyBoxes;
   }
   public int countCurrentSumm(){
      int res = 0;
      for (var m :moneyBoxes ) {
         res += (m.getCount()*m.getNominal());
      }
      return res;
   }
   public void addMoneyBox(int n1,int n2, int n3){
       if(moneyBoxes.size() <= maxNumberMoneyBoxes) {
           MonyeBox m = new MonyeBox(n1, n2, n3);
           moneyBoxes.add(m);
       }else{
           throw new AtmIsAlreadyFullOfMoneyBoxes();
       }
   }

   public void minusCount( MonyeBox mb, int number) {
      int newCount = mb.getCount()-1;
      if(newCount < 0 ){
         throw new NotInafMoneyInBox(number);
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
       try {
          if( n < minSummOut){
            throw new MinSummToGiveExeption(minSummOut);
           }
          else{
              int giveOutSumma = takeMoneyFromBox(n, 500);
               giveOutSumma = takeMoneyFromBox(n - giveOutSumma, 200);
               giveOutSumma = takeMoneyFromBox(n - giveOutSumma, 100);
               giveOutSumma = takeMoneyFromBox(n - giveOutSumma, 50);
               giveOutSumma = takeMoneyFromBox(n - giveOutSumma, 20);
               giveOutSumma = takeMoneyFromBox(n - giveOutSumma, 10);
               giveOutSumma = takeMoneyFromBox(n - giveOutSumma, 5);
              giveOutSumma = takeMoneyFromBox(n - giveOutSumma, 2);
              giveOutSumma = takeMoneyFromBox(n - giveOutSumma, 1);
               if(giveOutSumma!=n){
                   System.out.println("Возможно выдать только сумму:  " + giveOutSumma);
                   System.out.println("Подтвердите выдачу этой суммы: нажмите 1");
                   try{
                       Scanner scanner = new Scanner(System.in);
                      int choise= scanner.nextInt();
                      if(choise==1){
                          System.out.println("Заберите деньги в сумме: " + giveOutSumma);
                      }
                   }
                   catch(Exception e) {
                       System.out.println("Отмена операции!");
                   }
               }
               else{
                   System.out.println("Возьмите свои деньги в сумме:  " + giveOutSumma);
               }
          }
       }
       catch (MinSummToGiveExeption e){
           System.out.println(e.getMessage());
       }
   }
   public int takeMoneyFromBox(int summa, int nominal){
       int giveOutSumma = 0;
       int number1 = summa/nominal;
       if(number1 > 0){
           MonyeBox monyebox = findMoneyBox(nominal);
           if (monyebox != null){
               boolean have = true;
               int numberCoupure = 0;
               while(number1 > 0 && have) {
                   try {
                       minusCount(monyebox,numberCoupure);
                       numberCoupure++;
                       number1--;
                   } catch (NotInafMoneyInBox e) {
                       numberCoupure=e.getCount();
                       have=false;
                   }
               }
               giveOutSumma += numberCoupure * nominal;
           }
       }
       return giveOutSumma;
   }
    public MonyeBox findMoneyBox(int nominal){
        for (var m :moneyBoxes ) {
            if(m.getNominal()==nominal){
                return m;
            }
        }
        return null;
    }
}
