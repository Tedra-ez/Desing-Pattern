package SecondPart.Strategy.strategy;

import SecondPart.Strategy.Interface.IPaymentStrategy;

public class KaspiQRPayment implements IPaymentStrategy {
    private static final String DESCRIPTION = "Оплата через Kaspi QR (сканирование кода) ";

    @Override
    public void pay(double amount) {
        System.out.println("Выполняется оплата " + amount + "₸ через Kaspi QR ");
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}