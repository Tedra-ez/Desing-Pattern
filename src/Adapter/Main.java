package Adapter;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor kaspi = new KaspiProcceor();
        PaymentProcessor halyk = new HalykProcessor();

        kaspi.process(50.75);
        halyk.process(120.00);

        System.out.println("---- Используем старую систему через адаптер ----");

        OldPaymentSystem oldSystem = new OldPaymentSystem();

        PaymentProcessor adaptedPayment = new PaymentAdapter(oldSystem);
        adaptedPayment.process(30.50);
    }
}