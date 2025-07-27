package BehavioralDesignPatterns.Template.Ugly_Code.Concrete_Beverages;

public class Tea {
    public void prepare() {
        boilWater(); // repeated in Coffee as well
        steepTeaBag();
        pourInCup(); // repeated in Coffee as well
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void steepTeaBag() {
        System.out.println("Steeping tea bag...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    private void addLemon() {
        System.out.println("Adding lemon...");
    }
}