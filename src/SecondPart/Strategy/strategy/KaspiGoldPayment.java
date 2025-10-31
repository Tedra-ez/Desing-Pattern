package SecondPart.Strategy.strategy;

import SecondPart.Strategy.Interface.IPaymentStrategy;

public class KaspiGoldPayment implements IPaymentStrategy {
    private static final String DESCRIPTION = "Оплата через Kaspi Gold (дебетовая карта) ";

    @Override
    public void pay(double amount) {
        System.out.println("Выполняется оплата " + amount + "₸ через Kaspi Gold ");
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}