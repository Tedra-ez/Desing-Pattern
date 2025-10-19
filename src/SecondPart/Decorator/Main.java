package SecondPart.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Kaspi Decorator Example ===");

        IKaspiOperation operation = new KaspiOperation();
        IKaspiOperation cashbackOperation = new KaspiCashbackDecorator(operation);
        IKaspiOperation bonusOperation = new KaspiBonusDecorator(cashbackOperation);

        bonusOperation.makeOperation();
    }
}