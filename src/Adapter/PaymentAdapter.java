package Adapter;

public class PaymentAdapter implements PaymentProcessor {
    private final OldPaymentSystem oldSystem;

    public PaymentAdapter(OldPaymentSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void process(double amount) {
        int cents = (int) (amount * 100);
        oldSystem.makePayment(cents);
    }
}