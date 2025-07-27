package BehavioralDesignPatterns.Visitor.Good_Code;

import BehavioralDesignPatterns.Visitor.Good_Code.Concrete_Patients.*;

public interface Visitor {
    public void visit(ChildPatient childPatient);
    public void visit(AdultPatient adultPatient);
    public void visit(SeniorPatient seniorPatient);
}
