package BehavioralDesignPatterns.Command.Good_Code.Commands;

import BehavioralDesignPatterns.Command.Good_Code.Command;
import BehavioralDesignPatterns.Command.Good_Code.TV;

public class TurnOff implements Command {
    private TV tv;

    public TurnOff(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }
}
