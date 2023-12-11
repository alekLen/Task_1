package Bank.MyExeptions;

public class OnlyHaveSummaInBox  extends RuntimeException{
    private int summa;
    public OnlyHaveSummaInBox(int number) {
        summa=number;
    }

    @Override
    public String getMessage() {
        return "Возможно выдать только сумму:  " + summa;
    }

    public int getSumma() {
        return summa;
    }
}
