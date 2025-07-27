package BehavioralDesignPatterns.Template.Good_Code.Concrete_Beverages;

import BehavioralDesignPatterns.Template.Good_Code.Beverage;

public class CustomCoffee extends Beverage {
    @Override
    public void brew(){
        System.out.println("Brewing Coffee .....");
    }
    @Override
    public void addCondiments(){
        System.out.println("Adding Sugar and Milk .....");
    }
    // Suppose the customer doesn't want condiments
    @Override
    public boolean customerWantsCondiments(){
        return false;
    }
}
