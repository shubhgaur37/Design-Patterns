package BehavioralDesignPatterns.Visitor.Ugly_Code;

import BehavioralDesignPatterns.Visitor.Ugly_Code.Concrete_Patients.*;

public class HospitalTraditional {
    public static void main(String[] args) {
        Object patient = new AdultPatient(); // Could be ChildPatient or SeniorPatient
        // Using if-else to perform operations
        if (patient instanceof ChildPatient) {
            ((ChildPatient) patient).diagnosis();
            ((ChildPatient) patient).billing();
        } else if (patient instanceof AdultPatient) {
            ((AdultPatient) patient).diagnosis();
            ((AdultPatient) patient).billing();
        } else if (patient instanceof SeniorPatient) {
            ((SeniorPatient) patient).diagnosis();
            ((SeniorPatient) patient).billing();
        }
    }
}

/*
 *ISSUES WITH THIS APPROACH
 1. Too many instanceOf checks: As more patient types are added, we will have to keep on adding more if-else statements.
 2. Difficult to maintain: if a new operation(such as health report) is added, we will have to update each patient class.
 3. Violation of Open/Closed Principle: We are modifying existing code instead of extending it cleanly.
 4. Not Scalable: Imagine adding 10 more patient types and 5 new operations. The code would become a nightmare to manage.
 */
/*

Output :
Diagnosing an adult patient.
Calculating billing for an adult patient.

*/