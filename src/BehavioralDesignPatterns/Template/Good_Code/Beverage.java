package BehavioralDesignPatterns.Template.Good_Code;
    // Abstract Template that defines the algorithm for beverage preparation
public abstract class Beverage {
    // the template method: ensures steps for the algorithm are followed
    final void prepare(){
        boilWater();
        brew();
        pourInCup();
        // only add condiments if customer wants it
        if (customerWantsCondiments()){
            addCondiments();
        }

    }

    // Common Methods

    private void boilWater(){
        System.out.println("Boiling Water .....");
    }

    private void pourInCup(){
        System.out.println("Pouring into Cup .....");
    }

    // Steps to be customised by subclasses
    public abstract void brew();

    public abstract void addCondiments();
    
    // hook method with default behaviour: to incorporate customer preferences for a beverage
    public boolean customerWantsCondiments(){
        return true;
    }
}
