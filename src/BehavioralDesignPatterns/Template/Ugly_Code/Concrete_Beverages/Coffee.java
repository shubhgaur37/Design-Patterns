package BehavioralDesignPatterns.Template.Ugly_Code.Concrete_Beverages;
public class Coffee {
    public void prepare() {
        boilWater(); // repeated in Tea as well
        brewCoffee();
        pourInCup(); // repeated in Tea as well
        addSugarAndMilk(); 
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void brewCoffee() {
        System.out.println("Brewing coffee...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar and milk...");
    }
}