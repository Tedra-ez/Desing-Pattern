package SecondPart.Decorator;

public abstract class KaspiDecorator implements IKaspiOperation {
    protected IKaspiOperation decoratedOperation;

    public KaspiDecorator(IKaspiOperation decoratedOperation) {
        this.decoratedOperation = decoratedOperation;
    }

    @Override
    public void makeOperation() {
        decoratedOperation.makeOperation();
    }
}