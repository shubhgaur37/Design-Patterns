package BehavioralDesignPatterns.Template.Good_Code.Concrete_Beverages;

import BehavioralDesignPatterns.Template.Good_Code.Beverage;

public class Tea extends Beverage {
    @Override
    public void brew(){
        System.out.println("Steeping Tea Bag .....");
    }
    @Override
    public void addCondiments(){
        System.out.println("Squeezing Lemon .....");
    }
    
}
