package BehavioralDesignPatterns.Strategy.Good_Code;

import BehavioralDesignPatterns.Strategy.Good_Code.Concrete_Payment_Methods.*;

public class Main {
    public static void main(String[] args) {
        // Initialise Payment Strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy cryptoPayment = new CryptoPayment();
        PaymentStrategy paypalPayment = new PayPalPayment();
        PaymentStrategy stripePayment = new StripePayment();

        // Initialise Payment Processor with credit card
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCardPayment);
        // Process payment using Credit Card
        paymentProcessor.processPayment();

        // Change to Crypto Payment and process
        paymentProcessor.setPaymentStrategy(cryptoPayment);
        paymentProcessor.processPayment();

        // Change to Paypal Payment and process
        paymentProcessor.setPaymentStrategy(paypalPayment);
        paymentProcessor.processPayment();

        // Change to Stripe Payment and process
        paymentProcessor.setPaymentStrategy(stripePayment);
        paymentProcessor.processPayment();

    }
}
