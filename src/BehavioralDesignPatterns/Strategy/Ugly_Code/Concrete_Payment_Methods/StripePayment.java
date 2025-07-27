package BehavioralDesignPatterns.Strategy.Ugly_Code.Concrete_Payment_Methods;

import BehavioralDesignPatterns.Strategy.Ugly_Code.PaymentMethod;

public class StripePayment implements PaymentMethod {
    public void processPayment() {
        System.out.println("Processing Stripe payment...");
    }
}