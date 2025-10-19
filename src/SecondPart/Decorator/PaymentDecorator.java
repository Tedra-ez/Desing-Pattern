package SecondPart.Decorator;

public abstract class PaymentDecorator extends KaspiPayment {
    protected KaspiPayment payment;

    public PaymentDecorator(KaspiPayment payment) {
        this.payment = payment;
    }

    @Override
    public void pay() {
        payment.pay();
    }
}