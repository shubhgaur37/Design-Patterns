package BehavioralDesignPatterns.Command.Good_Code.Commands;

import BehavioralDesignPatterns.Command.Good_Code.Command;
import BehavioralDesignPatterns.Command.Good_Code.TV;

public class TurnOn implements Command{
    private TV tv;

    public TurnOn(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
