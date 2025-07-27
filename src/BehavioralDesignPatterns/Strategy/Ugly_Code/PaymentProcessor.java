package BehavioralDesignPatterns.Strategy.Ugly_Code;

import BehavioralDesignPatterns.Strategy.Ugly_Code.Concrete_Payment_Methods.*;

public class PaymentProcessor {
    // This method processes payment based on the payment method type
    public void processPayment(String paymentMethod) {
        if (paymentMethod.equals("CreditCard")) {
            CreditCardPayment creditCard = new CreditCardPayment();
            creditCard.processPayment(); // Process Credit Card payment
        } else if (paymentMethod.equals("PayPal")) {
            PayPalPayment payPal = new PayPalPayment();
            payPal.processPayment(); // Process PayPal payment
        } else if (paymentMethod.equals("Crypto")) {
            CryptoPayment crypto = new CryptoPayment();
            crypto.processPayment(); // Process Crypto payment
        } else if (paymentMethod.equals("Stripe")) {
            StripePayment stripe = new StripePayment();
            stripe.processPayment(); // Process Stripe payment
        } else {
            System.out.println("Payment method not supported.");
        }
    }
}


// Issues with this code:
// 1. We have moved the payment logic to individual classes, but we still have to modify payment processor class for any new payment method. It also
//    violates the Open/Closed Principle.
// 2. Scalability issues: Imagine having 20+ payment methods which will make the Payment processor class massive, also making it hard to read and 
//    modify

