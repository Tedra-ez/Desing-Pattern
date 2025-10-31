package SecondPart.Facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Kaspi Facade Example ===");

        KaspiFacade kaspi = new KaspiFacade();

        kaspi.registerUser("Aigerim", "+77081234567");
        kaspi.registerUser("Daniyar", "+77075554433");

        System.out.println();

        kaspi.searchUser("Aigerim");
        kaspi.searchUser("Zhanibek");
    }
}