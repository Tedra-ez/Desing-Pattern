package SecondPart.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Kaspi Decorator Example ===");

//        KaspiPayment payment = new KaspiPayment();
//
//        KaspiPayment validatedPayment = new ValidationPaymentDecorator(payment);
//        KaspiPayment notifiedPayment = new NotificationPaymentDecorator(validatedPayment);


        KaspiPayment payment = new ValidationPaymentDecorator(new NotificationPaymentDecorator(new KaspiPayment()));

        payment.pay();
    }
}