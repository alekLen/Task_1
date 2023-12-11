package Bank;

public class Main {
    public static void main(String[] args) {

        Bank bank= new Bank(3);
        ATM atm1=new ATM(1000,20000,8);
        atm1.addMoneyBox(500,600,1000);
        atm1.addMoneyBox(200,600,1000);
        atm1.addMoneyBox(100,600,1000);
         atm1.addMoneyBox(50,600,1000);
         bank.addAtm(atm1);

        ATM atm2=new ATM(1000,20000,8);
        atm2.addMoneyBox(500,800,1000);
        atm2.addMoneyBox(200,600,1000);
        atm2.addMoneyBox(100,800,1000);
        atm2.addMoneyBox(50,600,1000);
        atm2.addMoneyBox(20,800,1000);
        bank.addAtm(atm2);

        int summa = bank.CurentSummInAllAtms();
        System.out.println("Общая сумма в банке:  " + summa);

          atm1.giveOutMoney(200);
        atm1.giveOutMoney(15200);
         atm1.giveOutMoney(15205);
        atm1.giveOutMoney(25200);
        summa = bank.CurentSummInAllAtms();
        System.out.println("Общая сумма в банке:  " + summa);

        atm2.giveOutMoney(1220);
        atm2.giveOutMoney(13270);
        summa = bank.CurentSummInAllAtms();
        System.out.println("Общая сумма в банке:  " + summa);

        atm2.putInMoneyBox(20,500);
        summa = bank.CurentSummInAllAtms();
        System.out.println("Общая сумма в банке:  " + summa);

        atm2.putInMoneyBox(320,500);
        summa = bank.CurentSummInAllAtms();
        System.out.println("Общая сумма в банке:  " + summa);

        atm2.statisticAtm();

    }

}
