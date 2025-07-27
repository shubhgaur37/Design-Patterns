package BehavioralDesignPatterns.Memento.Good_Code;

public class TextEditor {
    private String text;
    // get the current text
    public String getText(){
        return this.text;
    }

    // set new text
    public void setText(String text){
        this.text = text;
    }

    // save the state of Text editor
    public Memento save(){
        return new Memento(text);
    }

    // restore the state of text editor using memento(memory snapshot)
    public void restore(Memento memento){
        this.text = memento.getText();
    }
}
