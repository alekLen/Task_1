package ClassesPackage;

public class Fraction {
    private int numerator;
    private int denomirator;

    public Fraction(int numerator, int denomirator) {
        if(denomirator!=0){
            this.numerator = numerator;
            this.denomirator = denomirator;
        }
        else{
            System.out.println("Некорректные данные: нельзя делить на ноль!");
            this.denomirator = 1;
            System.out.println("Установлен знаменатель по умолчанию, равный 1!");
            this.numerator = numerator;
        }
    }
    public Fraction(int numerator) {
            this.numerator = numerator;
            this.denomirator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenomirator() {
        return denomirator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenomirator(int denomirator) {
        if(denomirator!=0){
            this.denomirator = denomirator;
        }
        else{
            System.out.println("Некорректные данные: нельзя делить на ноль!");
            this.denomirator = 1;
            System.out.println("Установлен знаменатель по умолчанию, равный 1!");
        }
    }

   public static Fraction summFractions(Fraction a,Fraction b){
        int number1=a.numerator;
        int number2=b.numerator;
        int number3=a.denomirator;
        int number4=b.denomirator;

        int newNumerator=number1 * number4 + number2 * number3;
        int newDenominator=number3 * number4;

        int genDevis=genericDevisor(newNumerator, newDenominator);

        return new Fraction(newNumerator/genDevis,newDenominator/genDevis);
   }
    public static Fraction substractFractions(Fraction a,Fraction b){
        int number1=a.numerator;
        int number2=b.numerator;
        int number3=a.denomirator;
        int number4=b.denomirator;

        int newNumerator=number1 * number4 - number2 * number3;
        int newDenominator=number3 * number4;

        int genDevis=genericDevisor(newNumerator, newDenominator);

        return new Fraction(newNumerator/genDevis,newDenominator/genDevis);
    }
    public static Fraction multiplicatFractions(Fraction a,Fraction b){
        int newNumerator=a.numerator * b.numerator;
        int newDenominator=a.denomirator * b.denomirator;

        int genDevis=genericDevisor(newNumerator, newDenominator);

        return new Fraction(newNumerator/genDevis,newDenominator/genDevis);
    }
    public static Fraction devisionFractions(Fraction a,Fraction b){
        int number1=a.numerator;
        int number2 = 1;
        if(b.numerator != 0) {
             number2 = b.numerator;
        }else{
            System.out.println("Некорректные данные: нельзя делить на ноль!");
            b.numerator = 1;
            System.out.println("Установлен числитель второй дроби по умолчанию, равный 1!");
        }
        int number3=a.denomirator;
        int number4=b.denomirator;
        int newNumerator=number1 *number4;
        int newDenominator=number3 * number2;

        int genDevis=genericDevisor(newNumerator, newDenominator);

        return new Fraction(newNumerator/genDevis,newDenominator/genDevis);
    }
    private static int genericDevisor(int a, int b) {
        if(a < 0) {
            a *= -1;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public   void putNumerator(int number){
        numerator= number;
    }
    public   void putDenominator(int number){
        if(number!=0){
            denomirator = number;
        } else{
            System.out.println("Некорректные данные: нельзя делить на ноль!");
            denomirator = 1;
            System.out.println("Установлен знаменатель по умолчанию, равный 1!");
        }
    }
    public void printFraction(){
        System.out.print(this);
    }
    @Override
    public String toString() {
        if ((numerator > denomirator && numerator>0)||(numerator * -1 > denomirator && numerator < 0)) {
            int whole = numerator / denomirator;

            if(numerator % denomirator == 0){
                return whole + "";
            }
           else {
                int newNumerator = numerator - whole * denomirator;

                if(numerator < 0){
                    newNumerator *= -1;
                }
                return whole + " " + newNumerator + "/" + denomirator;
            }
        } else {
            return numerator + "/" + denomirator;
        }
    }

}
