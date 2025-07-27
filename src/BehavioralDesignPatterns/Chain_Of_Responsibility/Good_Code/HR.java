package BehavioralDesignPatterns.Chain_Of_Responsibility.Good_Code;

public class HR extends Approver {

    @Override
    public void processLeaveRequest(int days){
        System.out.println("HR: Leave Request requires further discussion");
    }
}
