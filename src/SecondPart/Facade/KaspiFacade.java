package SecondPart.Facade;

public class KaspiFacade {
    private Phone phone;
    private KaspiApp kaspi;
    private KaspiNotification notification;

    public KaspiFacade(Phone phone, KaspiApp kaspi, KaspiNotification notification) {
        this.phone = phone;
        this.kaspi = kaspi;
        this.notification = notification;
    }

    public void startKaspi() {
        System.out.println("=== Kaspi запуск ===");
        phone.on();
        kaspi.on();
        notification.on();
        notification.getNotification();
        System.out.println();
    }

    public void stopKaspi() {
        System.out.println("=== Kaspi завершение ===");
        notification.removeNotification();
        notification.off();
        kaspi.off();
        phone.off();
    }
}