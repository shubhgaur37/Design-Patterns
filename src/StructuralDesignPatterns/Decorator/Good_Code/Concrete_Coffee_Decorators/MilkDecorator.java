package StructuralDesignPatterns.Decorator.Good_Code.Concrete_Coffee_Decorators;


import StructuralDesignPatterns.Decorator.Good_Code.Coffee;
import StructuralDesignPatterns.Decorator.Good_Code.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    
    @Override
    public String getDescription(){
        return coffee.getDescription() + " with Milk";
    }

    @Override
    public double getCost(){
        return coffee.getCost() + 0.5;
    }
}
