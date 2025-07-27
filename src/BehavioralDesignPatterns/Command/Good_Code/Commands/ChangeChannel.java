package BehavioralDesignPatterns.Command.Good_Code.Commands;

import BehavioralDesignPatterns.Command.Good_Code.Command;
import BehavioralDesignPatterns.Command.Good_Code.TV;

public class ChangeChannel implements Command {
    private TV tv;
    private int channelNumber;

    public ChangeChannel(TV tv, int channelNumber){
        this.tv = tv;
        this.channelNumber = channelNumber;
    }

    @Override
    public void execute() {
        tv.changeChannel(channelNumber);
    }
}
