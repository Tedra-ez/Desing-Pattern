package SecondPart.Facade;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        KaspiApp kaspiApp = new KaspiApp();
        KaspiNotification notification = new KaspiNotification();

        KaspiFacade kaspi = new KaspiFacade(phone, kaspiApp, notification);

        kaspi.startKaspi();
        kaspi.stopKaspi();
    }
}