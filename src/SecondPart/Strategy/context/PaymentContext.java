package SecondPart.Strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(double amount) {
        if (strategy == null) {
            System.out.println("Способ оплаты не выбран ❌");
        } else {
            strategy.pay(amount);
        }
    }
}