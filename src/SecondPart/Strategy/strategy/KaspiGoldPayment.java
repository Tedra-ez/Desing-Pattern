package SecondPart.Strategy;

public class KaspiGoldPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + "₸ через Kaspi Gold 💳");
    }
}