package FirstPart.bridge;

public class BridgeBankDemo {
    public static void main(String[] args) {
        PaymentSystem kaspi = new KaspiPaymentSystem();
        PaymentSystem halyk = new HalykPaymentSystem();

        Transaction transfer = new TransferTransaction(kaspi);
        transfer.makePayment("Kaspi-001", "Kaspi-002", 50000);

        Transaction utilities = new UtilityBillPayment(halyk);
        utilities.makePayment("Halyk-555", "AstanaEnergo", 12500);

        Transaction halykTransfer = new TransferTransaction(halyk);
        halykTransfer.makePayment("Halyk-100", "Kaspi-200", 32000);
    }
}