package BehavioralDesignPatterns.Chain_Of_Responsibility.Good_Code;

public class Supervisor extends Approver {

    @Override
    public void processLeaveRequest(int days){
        if (days <= 3){
            System.out.println("Supervisor approved the leave");
        }
        else // set the next approver in the chain(less flexible because we are setting the chain in the class itself)
        {
            this.setNextApprover(new Manager());
            nextApprover.processLeaveRequest(days);
        }
            
            // flexibility will increase if we set the next approver for each class in Client code as we can customise the chain easily without
            // navigating multiple approver level classes

            // Also if the code to set the next approver is used in main class then we will need to use an else if statement checking if the 
            // next approver is not null
    }
}
