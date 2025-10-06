package bridge;

class HalykPaymentSystem implements PaymentSystem {
    @Override
    public void processPayment(String accountFrom, String accountTo, double amount) {
        System.out.println("Halyk Bank processing payment of " + amount +
                "₸ from " + accountFrom + " to " + accountTo + " via Halyk Online.");
    }
}