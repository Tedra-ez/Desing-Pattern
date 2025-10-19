package SecondPart.Decorator;

public class NotificationPaymentDecorator extends PaymentDecorator {

    public NotificationPaymentDecorator(KaspiPayment payment) {
        super(payment);
    }

    @Override
    public void pay() {
        super.pay();
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("Уведомление пользователю: оплата успешно выполнена 📲");
    }
}