package Adapter;

public class HalykProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Halyk: списано " + amount + " KZT");
    }
}