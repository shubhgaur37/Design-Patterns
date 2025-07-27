package BehavioralDesignPatterns.Visitor.Good_Code.Concrete_Visitors;

import BehavioralDesignPatterns.Visitor.Good_Code.Visitor;
import BehavioralDesignPatterns.Visitor.Good_Code.Concrete_Patients.*;

public class Billing_Visitor implements Visitor {

    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Calculating Bills for Child Patient");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Calculating Bills for Adult Patient");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Calculating Bills for Senior Patient");
    }
    
}
