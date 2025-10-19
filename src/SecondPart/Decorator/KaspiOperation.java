package SecondPart.Decorator;

public class KaspiOperation implements IKaspiOperation {
    @Override
    public void makeOperation() {
        System.out.println("Покупка через Kaspi произведена");
    }
}