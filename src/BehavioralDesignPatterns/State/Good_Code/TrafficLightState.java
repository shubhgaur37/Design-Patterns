package BehavioralDesignPatterns.State.Good_Code;

public interface TrafficLightState {
    String getColor();
    void next(TrafficLightContext context);
}
