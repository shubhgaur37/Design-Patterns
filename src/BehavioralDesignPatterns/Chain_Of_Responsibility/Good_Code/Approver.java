package BehavioralDesignPatterns.Chain_Of_Responsibility.Good_Code;

public abstract class Approver {
    // contains the next Approver in the chain
    protected Approver nextApprover;
    
    // Concrete Method to set the Next Approver
    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover;
    }

    public abstract void processLeaveRequest(int days);

}
