package SecondPart.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Kaspi Decorator Example ===");

<<<<<<< HEAD
        IKaspiOperation operation = new KaspiOperation();
        IKaspiOperation cashbackOperation = new KaspiCashbackDecorator(operation);
        IKaspiOperation bonusOperation = new KaspiBonusDecorator(cashbackOperation);

        bonusOperation.makeOperation();
=======
        KaspiPayment payment = new KaspiPayment();

        KaspiPayment validatedPayment = new ValidationPaymentDecorator(payment);
        KaspiPayment notifiedPayment = new NotificationPaymentDecorator(validatedPayment);

        notifiedPayment.pay();
>>>>>>> 77d0458 (commit)
    }
}