package BehavioralDesignPatterns.Template.Good_Code;

import BehavioralDesignPatterns.Template.Good_Code.Concrete_Beverages.*;

public class Main {
    public static void main(String[] args) {
        // An interesting thing to notice here is prepare method uses functions: boilWater() and pourInCup() which are not inherited by its
        // subclasses because of them being private but we still can access them due to the fact that we are invoking the prepare method from
        // its parent abstract class
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();
        Beverage customCoffee = new CustomCoffee();
        System.out.println("Making coffee...");
        coffee.prepare(); 
        System.out.println("###############");
        System.out.println("Making tea...");
        tea.prepare();
        System.out.println("###############"); 
        customCoffee.prepare();
    }
}


// Why this approach is better?

// 1. No more duplicated code
// 2. The common steps(boiling water & pouring into a cup) are written once.
// 3. Subclasses only worry about their unique steps
// 4. Easy to extend(Scalable): just extend a new subclass from the template without touching exisiting code.

// Advantages:
// 1. Reduces Code Duplication: Common algorithm steps are centralised in the base class. No need to rewrite the same logic in subclasses.
// Write once, use everywhere

// 2. Enforces Consistency: The overall structure remains the same across all implementations. Each subclass follows the same process, ensuring 
// uniformity. No rogue subclasses breaking the flow of algorithm.

// 3. Improves Maintainability: Make changes in one place and it updates everywhere. If you find a bug in the shared logic, you only need to fix
// it once instead of in multiple places. Fewer errors, more efficiency.

// 4. Enhances Code Reusability: Write code once, reuse it forever. The abstract class defines the shared behavior, while subclasses customize their
// parts. Promotes DRY(Don't Repeat Yourself) Principles.

// 5. Provides Flexibility: Override only the parts that need customization. The main algorithm remains untouched, but subclasses can tweak specific
// steps. Great for frameworks and API's.


