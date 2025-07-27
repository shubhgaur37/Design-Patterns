package BehavioralDesignPatterns.Template.Ugly_Code;

import BehavioralDesignPatterns.Template.Ugly_Code.Concrete_Beverages.*;

public class TraditionalBeverageDemo {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        System.out.println("Making coffee...");
        coffee.prepare(); // Code Duplication
        System.out.println("nMaking tea...");
        tea.prepare(); // Code Duplication
    }
}

/*

Output :
Making coffee...
Boiling water...
Brewing coffee...
Pouring into cup...
Adding sugar and milk...
nMaking tea...
Boiling water...
Steeping tea bag...
Pouring into cup...
Adding lemon...

*/

// Problems with this code
// 1. Redundant Code: Boiling Water and Pour into Cup are repeated in both Tea and Coffee classes.
// 2. If we need to modify one step, we have to change it in multiple places.
// 3. Not Scalable. What if we add hot chocolate or iced tea?
