package Adapter;

public class HalykAdapter implements Payment {
    private HalykPayment halyk;

    public HalykAdapter(HalykPayment halyk) {
        this.halyk = halyk;
    }

    @Override
    public void pay() {
        halyk.processHalyk();
        System.out.println("Halyk адаптирован!");

    }
}