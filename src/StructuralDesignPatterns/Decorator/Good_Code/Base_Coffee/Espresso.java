package StructuralDesignPatterns.Decorator.Good_Code.Base_Coffee;

import StructuralDesignPatterns.Decorator.Good_Code.Coffee;

public class Espresso implements Coffee {
    
    @Override
    public String getDescription(){
        return "Espresso";
    }

    @Override
    public double getCost(){
        return 2.0;
    }

}
