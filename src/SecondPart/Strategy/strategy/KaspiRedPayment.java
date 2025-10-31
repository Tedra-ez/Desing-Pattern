package SecondPart.Strategy.strategy;

import SecondPart.Strategy.Interface.IPaymentStrategy;

public class KaspiRedPayment implements IPaymentStrategy {
    private static final String DESCRIPTION = "Оплата через Kaspi Red (рассрочка) ";

    @Override
    public void pay(double amount) {
        System.out.println("Выполняется оплата " + amount + "₸ через Kaspi Red ");
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}