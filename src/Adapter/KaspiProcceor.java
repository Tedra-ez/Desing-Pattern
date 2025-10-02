package Adapter;

public class KaspiProcceor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Kaspi: оплачено " + amount+ "KZT");
    }
}