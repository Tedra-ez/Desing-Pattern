package SecondPart.Strategy;

public class KaspiRedPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + "₸ через Kaspi Red (рассрочка) 💸");
    }
}