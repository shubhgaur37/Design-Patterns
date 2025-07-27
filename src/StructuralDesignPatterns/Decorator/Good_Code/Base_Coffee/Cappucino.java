package StructuralDesignPatterns.Decorator.Good_Code.Base_Coffee;

import StructuralDesignPatterns.Decorator.Good_Code.Coffee;

public class Cappucino implements Coffee{

        @Override
    public String getDescription(){
        return "Cappucino";
    }

    @Override
    public double getCost(){
        return 3.0;
    }
}
