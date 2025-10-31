package SecondPart.Strategy.Interface;

public interface IPaymentStrategy {
    void pay(double amount);
    String getDescription();
}