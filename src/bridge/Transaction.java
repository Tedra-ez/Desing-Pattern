package bridge;

abstract class Transaction {
    protected PaymentSystem paymentSystem;

    protected Transaction(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public abstract void makePayment(String from, String to, double amount);
}