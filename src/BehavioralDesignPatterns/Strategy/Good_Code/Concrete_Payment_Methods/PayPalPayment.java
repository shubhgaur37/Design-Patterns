package BehavioralDesignPatterns.Strategy.Good_Code.Concrete_Payment_Methods;

import BehavioralDesignPatterns.Strategy.Good_Code.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}