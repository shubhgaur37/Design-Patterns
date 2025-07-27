package BehavioralDesignPatterns.Chain_Of_Responsibility.Good_Code;

public class Main {
    public static void main(){
        // Initialise the Chain of Responsibility with the first level
        Approver approver = new Supervisor();
        int leaveDays1 = 2;
        int leaveDays2 = 5;
        int leaveDays3 = 9;
        int leaveDays4 = 30;

        // process leaves
        approver.processLeaveRequest(leaveDays1);
        System.out.println("###################");
        approver.processLeaveRequest(leaveDays2);
        System.out.println("###################");
        approver.processLeaveRequest(leaveDays3);
        System.out.println("###################");
        approver.processLeaveRequest(leaveDays4);

    }
}

// Benefits: Why to Use the Chain of Responsibility Design Pattern
// 1. Loose Coupling between sender and handler: The sender(employee) doesn't need to know who will approve the leave. This decouples sender and
// receiver, making the system more flexible.
// 2. Enhanced Flexibility and Scalability: Easily add new handlers (HR, CFO, or CEO) without modifying existing code. Reorder handlers dynamically
// based on business rules.
// 3. Improved Code Organization and Maintainability: Instead of messy if-else conditions, each handler has one responsibility.
// Modular structure makes debugging simpler and more efficient.
// 4. Reusability of handlers: The same handlers like (Manager, Supervisor, etc.) can be used in other workflows.(like expense approvals)
// 5. Dynamic Request Handling: Requests flow through the chain until a suitable handler is found. New approval rules? No Problem!
// Just add a new handler.

