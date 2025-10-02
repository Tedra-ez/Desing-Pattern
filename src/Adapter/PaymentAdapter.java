package Adapter;

public class PaymentAdapter implements PaymentProcessor {
    private final OldPaymentSystem oldSystem;

    public PaymentAdapter(OldPaymentSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void process(double amount) {
        int tiyn = (int) (amount * 100);
        oldSystem.makePayment(tiyn);
    }
}