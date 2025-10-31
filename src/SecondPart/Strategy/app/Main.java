package Second_Half.Strategy.app;

import Second_Half.Strategy.context.PaymentContext;
import Second_Half.Strategy.strategy.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("=== Kaspi Payment System ===");
        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Kaspi Gold ");
        System.out.println("2 - Kaspi Red ");
        System.out.println("3 - Kaspi QR ");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        IPaymentStrategy strategy;

        IPaymentStrategy kaspiGold = new KaspiGoldPayment();
        IPaymentStrategy kaspiRed = new KaspiRedPayment();
        IPaymentStrategy kaspiQR = new KaspiQRPayment();

        switch (choice) {
            case 1 -> strategy = kaspiGold;
            case 2 -> strategy = kaspiRed;
            case 3 -> strategy = kaspiQR;
            default -> {
                System.out.println("Некорректный выбор! По умолчанию используется Kaspi Gold.");
                strategy = kaspiGold;
            }
        }

        context.setStrategy(strategy);

        System.out.print("\nВведите сумму для оплаты: ");
        double amount = scanner.nextDouble();

        System.out.println("\n--- Начало операции ---");
        context.executePayment(amount);

        System.out.println("\nВыбранный метод: ");
        System.out.println(context.getStrategyDescription());

        scanner.close();
    }
}