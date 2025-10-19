package FirstPart.bridge;

class KaspiPaymentSystem implements PaymentSystem {
    @Override
    public void processPayment(String accountFrom, String accountTo, double amount) {
        System.out.println("Kaspi Bank processing payment of " + amount +
                "₸ from " + accountFrom + " to " + accountTo + " via Kaspi.kz app.");
    }
}