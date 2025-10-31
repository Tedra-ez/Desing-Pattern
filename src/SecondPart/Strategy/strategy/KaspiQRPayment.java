package SecondPart.Strategy;

public class KaspiQRPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + "₸ через Kaspi QR 📱");
    }
}