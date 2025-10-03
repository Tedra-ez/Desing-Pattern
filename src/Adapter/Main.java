package Adapter;

public class Main {
    public static void main(String[] args) {
        Payment kaspi = new KaspiAdapter();
        Payment halyk = new HalykAdapter();
        halyk.pay();
        kaspi.pay();
    }
}