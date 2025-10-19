package SecondPart.Facade;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Phone phone = new Phone();
        KaspiApp kaspiApp = new KaspiApp();
        KaspiNotification notification = new KaspiNotification();

        KaspiFacade kaspi = new KaspiFacade(phone, kaspiApp, notification);

        kaspi.startKaspi();
        kaspi.stopKaspi();
=======
        System.out.println("=== Kaspi Facade Example ===");

        KaspiFacade kaspi = new KaspiFacade();

        kaspi.registerUser("Aigerim", "+77081234567");
        kaspi.registerUser("Daniyar", "+77075554433");

        System.out.println();

        kaspi.searchUser("Aigerim");
        kaspi.searchUser("Zhanibek");
>>>>>>> 77d0458 (commit)
    }
}