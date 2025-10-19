package FirstPart.bridge;

interface PaymentSystem {
    void processPayment(String accountFrom, String accountTo, double amount);
}