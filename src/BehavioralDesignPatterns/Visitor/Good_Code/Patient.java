package BehavioralDesignPatterns.Visitor.Good_Code;
// Every patient will implement this interface that allows them to accept a visitor

public interface Patient {
    // this method will allow a patient to welcome a visitor to perform an operation associated with it.
    // Now the patient classes don't need extra logic
    void accept(Visitor visitor);
}
