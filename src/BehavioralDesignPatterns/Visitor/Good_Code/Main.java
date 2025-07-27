package BehavioralDesignPatterns.Visitor.Good_Code;

import BehavioralDesignPatterns.Visitor.Good_Code.Concrete_Patients.*;
import BehavioralDesignPatterns.Visitor.Good_Code.Concrete_Visitors.*;

public class Main {
    public static void main(String[] args) {
        // Create an array of patients
        Patient[] patients = {new ChildPatient(), new AdultPatient(), new SeniorPatient()};
        
        // Create visitors for different operations
        Visitor diagnosisVisitor = new Diagnosis_Visitor();
        Visitor billingVisitor = new Billing_Visitor();

        // Each patient accepts visitors to perform the operations
        for(Patient p : patients){
            // runtime-polymorphism in action
            p.accept(diagnosisVisitor);
            p.accept(billingVisitor);
            System.out.println("#########################");
        }
    } 
}

// Benefits of Using this pattern:
/*
1. Separation of Concerns: By decoupling operations from objects, the Visitor pattern keeps code clean and modular.
   Patient classes focus only on their sole responsibilities, while visitors handle all operations(like diagnosis, billing, etc)

2. Easy addition of new operations without touching the client code and related classes.

3. Double Dispatch magic: The visitor pattern leverages double dispatch i.e. The execution operation depends upon:
   a. the type of visitor(Diagnosis, Billing, etc.)
   b. the type of patient(Child, Adult, Senior)
This prevents messy if-else conditions while allowing precise type-based logic execution.

4. Simpler and cleaner patient classes: By offloading multiple operations to visitors, Patient classes remain lean and easy to read.
   They only need to implement a simple accept() method - no unnecessary compleity!

5. Flexibility in operations: 
   a. Need to change how billing works for a particular patient: easily possible
   b. Need to add new tax calculation for insurance claims?
No worries! We can easily introduce new visitors without modifying existing code.
 */