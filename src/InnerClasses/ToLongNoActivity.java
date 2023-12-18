package InnerClasses;

public class ToLongNoActivity extends RuntimeException{
    @Override
    public String getMessage() {
        return "Приставка завершает работу из-за отсутствия активности";
    }
}
