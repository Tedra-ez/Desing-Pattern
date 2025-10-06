package bridge;

class UtilityBillPayment extends Transaction {
    public UtilityBillPayment(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void makePayment(String from, String to, double amount) {
        System.out.println("[Utility Bill Payment]");
        paymentSystem.processPayment(from, to, amount);
    }
}