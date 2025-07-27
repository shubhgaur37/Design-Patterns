package BehavioralDesignPatterns.Strategy.Good_Code;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy; // Reference to Payment Strategy

    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(){
        paymentStrategy.processPayment(); // Delegate the payment processing to the appropriate strategy at runtime
    }

    // for setting the payment strategy dynamically at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
}

// Advantages of Using Strategy Design Pattern:
// 1. Flexibility: We can switch between different payment strategies at runtime without modifying the Payment Processor class.
// 2. Maintainability: New payment methods can be added by simply creating new strategy classes. We don't need to touch the existing code.
// 3. Separation of Concerns: Each payment method has its own class making the code easier to understand and maintain.
// 4. Extensibility: As new payment method becomes available, we can simply add them by creating new strategy classes.

