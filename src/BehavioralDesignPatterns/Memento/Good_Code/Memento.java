package BehavioralDesignPatterns.Memento.Good_Code;

public class Memento {
    private String text;

    public Memento(String text){
        this.text = text;
    }
    // getter for text
    public String getText(){
        return this.text;
    }
}
