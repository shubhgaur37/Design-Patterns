package BehavioralDesignPatterns.Template.Good_Code.Concrete_Beverages;

import BehavioralDesignPatterns.Template.Good_Code.Beverage;

public class Coffee extends Beverage{
    @Override
    public void brew(){
        System.out.println("Brewing Coffee .....");
    }
    @Override
    public void addCondiments(){
        System.out.println("Adding Sugar and Milk .....");
    }
}
