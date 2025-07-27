package BehavioralDesignPatterns.State.Good_Code.Concrete_States;

import BehavioralDesignPatterns.State.Good_Code.TrafficLightContext;
import BehavioralDesignPatterns.State.Good_Code.TrafficLightState;

public class MaintenanceState implements TrafficLightState {
    private String color;

    public MaintenanceState(){
        this.color = "MAINTENANCE";
    }
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Traffic Light: "+ color +" DONE. BACK TO RED!!!");
        context.setState(new RedState());
    }

    @Override
    public String getColor(){
        return color;
    }
}