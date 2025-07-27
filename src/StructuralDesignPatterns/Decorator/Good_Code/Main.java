package StructuralDesignPatterns.Decorator.Good_Code;

import StructuralDesignPatterns.Decorator.Good_Code.Base_Coffee.*;
import StructuralDesignPatterns.Decorator.Good_Code.Concrete_Coffee_Decorators.*;

/*
Advantages of Using Decorator Pattern:
1. Extensibility: The pattern allows us to add new functionalities (customizations) without modifying existing classes.
2. Flexibility: Customizations can be added dynamically, in any order, to any object.
3. Reusability: Decorators are reusable across different base objects and can be combined in different ways.
4. Open/Closed Principle: The pattern adheres to Open/Closed principle by allowing the system to be extended without modifying existing classes.

 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        coffee = new MilkDecorator(coffee); // coffee points to milk espresso as decorator wrapped milk over existing espresso
        coffee = new SugarDecorator(coffee);// coffee points to sugar milk espresso as decorator wrapped sugar over existing milk espresso

        System.out.println("Order: "+ coffee.getDescription());
        // now the description is because of method resolution order:
        // we call the getDescription of SugarDecorator which internally calls getDescription() of the coffee that we passed to it i.e. milk espresso
        // so it appends sugar to the description at the end. The order matters here
        System.out.println("Total Cost: "+ coffee.getCost());

        // Eg. changed order
        Coffee anotherCoffee = new Espresso();
        anotherCoffee = new SugarDecorator(anotherCoffee);
        anotherCoffee = new MilkDecorator(anotherCoffee); // coffee points to milk espresso as decorator wrapped milk over existing espresso

        System.out.println("####################");
        // same cost but different order in the description
        System.out.println("Order: "+ anotherCoffee.getDescription());
        System.out.println("Total Cost: "+ anotherCoffee.getCost());

        Coffee anotherCoffee1 = new Cappucino();
        anotherCoffee1 = new SugarDecorator(anotherCoffee1);

        System.out.println("####################");

        System.out.println("Order: "+ anotherCoffee1.getDescription());
        System.out.println("Total Cost: "+ anotherCoffee1.getCost());
    }
}
