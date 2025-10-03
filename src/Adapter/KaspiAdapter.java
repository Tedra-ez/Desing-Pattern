package Adapter;

public class KaspiAdapter extends KaspiPayment implements Payment {
    @Override
    public void pay() {
        super.sendKaspi();
        System.out.println("Kaspi адаптирован ✓");
    }
}