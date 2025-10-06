package Adapter;

public class KaspiAdapter implements Payment {
    private final KaspiPayment kaspiPayment;

    public KaspiAdapter(KaspiPayment kaspiPayment){
    this.kaspiPayment= kaspiPayment;

    }
    @Override
    public void pay() {
        kaspiPayment.sendKaspi();
        System.out.println("Kaspi адаптирован!");
    }
}