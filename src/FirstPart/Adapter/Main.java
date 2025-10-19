package FirstPart.Adapter;

public class Main {
    public static void main(String[] args) {

        HalykPayment halykPayment = new HalykPayment();
        Payment halyk = new HalykAdapter(halykPayment);
        KaspiPayment kaspiPayment = new KaspiPayment();

        Payment kaspi = new KaspiAdapter(kaspiPayment);
        halyk.pay();
        kaspi.pay();
    }
}