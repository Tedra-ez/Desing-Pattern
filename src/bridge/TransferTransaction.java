package bridge;

class TransferTransaction extends Transaction {
    public TransferTransaction(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void makePayment(String from, String to, double amount) {
        System.out.println("[Transfer Transaction]");
        paymentSystem.processPayment(from, to, amount);
    }
}