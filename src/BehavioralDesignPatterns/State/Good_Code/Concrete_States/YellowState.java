package BehavioralDesignPatterns.State.Good_Code.Concrete_States;

import BehavioralDesignPatterns.State.Good_Code.TrafficLightContext;
import BehavioralDesignPatterns.State.Good_Code.TrafficLightState;

public class YellowState implements TrafficLightState {
    private String color;

    public YellowState(){
        this.color = "YELLOW";
    }
    public String getColor(){
        return getColor();
    }
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Traffic Light: "+ color +" All Vehicles SLOW DOWN!!!");
        context.setState(new RedState());
    }
}
