package SecondPart.Decorator;

public class ValidationPaymentDecorator extends PaymentDecorator {

    public ValidationPaymentDecorator(KaspiPayment payment) {
        super(payment);
    }

    @Override
    public void pay() {
        validate();
        super.pay();
    }

    private void validate() {
        System.out.println("Проверка данных перед оплатой ✅");
    }
}