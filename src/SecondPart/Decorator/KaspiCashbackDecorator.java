package SecondPart.Decorator;

public class KaspiCashbackDecorator extends KaspiDecorator {

    public KaspiCashbackDecorator(IKaspiOperation decoratedOperation) {
        super(decoratedOperation);
    }

    @Override
    public void makeOperation() {
        super.makeOperation();
        addCashback();
    }

    private void addCashback() {
        System.out.println("Начислен кэшбэк: +500₸");
    }
}