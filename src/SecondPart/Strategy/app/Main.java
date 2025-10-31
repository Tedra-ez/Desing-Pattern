package SecondPart.Strategy.app;

import SecondPart.Strategy.Interface.IPaymentStrategy;
import SecondPart.Strategy.context.PaymentContext;
import SecondPart.Strategy.strategy.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        Map<Integer, IPaymentStrategy> strategies = new HashMap<>();
        strategies.put(1, new KaspiGoldPayment());
        strategies.put(2, new KaspiQRPayment());
        strategies.put(3, new KaspiRedPayment());

        System.out.println("=== Kaspi Payment System ===");
        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Kaspi Gold ");
        System.out.println("2 - Kaspi Red ");
        System.out.println("3 - Kaspi QR ");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        IPaymentStrategy selectedStrategy = strategies.getOrDefault(choice, new KaspiGoldPayment());
        context.setStrategy(selectedStrategy);

        System.out.print("\nВведите сумму для оплаты: ");
        double amount = scanner.nextDouble();

        System.out.println("\n--- Начало операции ---");
        context.executePayment(amount);

        System.out.println("\nВыбранный метод: ");
        System.out.println(context.getStrategyDescription());

        scanner.close();
    }
}