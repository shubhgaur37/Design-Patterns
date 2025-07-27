package BehavioralDesignPatterns.State.Good_Code.Concrete_States;

import BehavioralDesignPatterns.State.Good_Code.TrafficLightContext;
import BehavioralDesignPatterns.State.Good_Code.TrafficLightState;

public class RedState implements TrafficLightState {
    private String color;

    public RedState(){
        this.color = "RED";
    }
    public String getColor(){
        return getColor();
    }
    @Override
    public void next (TrafficLightContext context){
        System.out.println("Traffic Light: "+ color +" All Vehicles STOP!!!");
        context.setState(new GreenState());

    }
}
