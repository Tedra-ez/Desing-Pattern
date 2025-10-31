package SecondPart.Strategy.context;

import SecondPart.Strategy.Interface.IPaymentStrategy;

public class PaymentContext {
    private IPaymentStrategy strategy;

    public void setStrategy(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null) {
            System.out.println("Ошибка: способ оплаты не выбран!");
        } else {
            strategy.pay(amount);
        }
    }

    public String getStrategyDescription() {
        return (strategy == null)
                ? "Нет выбранной стратегии оплаты"
                : strategy.getDescription();
    }
}