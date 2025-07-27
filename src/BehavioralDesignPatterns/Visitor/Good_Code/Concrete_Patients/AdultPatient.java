package BehavioralDesignPatterns.Visitor.Good_Code.Concrete_Patients;

import BehavioralDesignPatterns.Visitor.Good_Code.Patient;
import BehavioralDesignPatterns.Visitor.Good_Code.Visitor;

public class AdultPatient implements Patient {
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
