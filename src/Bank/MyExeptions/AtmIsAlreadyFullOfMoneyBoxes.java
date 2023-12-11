package Bank.MyExeptions;

public class AtmIsAlreadyFullOfMoneyBoxes extends RuntimeException{
    @Override
    public String getMessage() {
        return "Банкомат уже максимально наполнен наполнен";
    }

}
