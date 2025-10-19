package SecondPart.Decorator;

public class KaspiBonusDecorator extends KaspiDecorator {

    public KaspiBonusDecorator(IKaspiOperation decoratedOperation) {
        super(decoratedOperation);
    }

    @Override
    public void makeOperation() {
        super.makeOperation();
        addBonus();
    }

    private void addBonus() {
        System.out.println("Добавлены бонусы: +10 Б");
    }
}