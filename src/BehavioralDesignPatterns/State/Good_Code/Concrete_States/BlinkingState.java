package BehavioralDesignPatterns.State.Good_Code.Concrete_States;

import BehavioralDesignPatterns.State.Good_Code.TrafficLightContext;
import BehavioralDesignPatterns.State.Good_Code.TrafficLightState;

public class BlinkingState implements TrafficLightState {
    private String color;

    public BlinkingState(){
        this.color = "BLINKING RED";
    }
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Traffic Light: "+ color +" All Vehicles to exercise caution while passing!!!");
        context.setState(new MaintenanceState());
    }

    @Override
    public String getColor(){
        return color;
    }
}
