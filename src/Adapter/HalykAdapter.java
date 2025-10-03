package Adapter;

public class HalykAdapter extends HalykPayment implements Payment {
    @Override
    public void pay() {
        super.processHalyk();
        System.out.println("Halyk адаптирован ✓");
    }
}