package BehavioralDesignPatterns.State.Good_Code;

import BehavioralDesignPatterns.State.Good_Code.Concrete_States.RedState;

// Context Class
public class TrafficLightContext {
    private TrafficLightState currentState;

    // Initialise the first state to RED
    public TrafficLightContext(){
        currentState = new RedState();
    }

    public void setState(TrafficLightState state){
        this.currentState = state;
    }

    // set the next state using the current state and update the context from the corresponding state by passing the instance of context
    public void next(){
        currentState.next(this);
    }
}
