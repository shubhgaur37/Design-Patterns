package BehavioralDesignPatterns.Memento.Good_Code;

import java.util.Stack;

public class EditorHistory {
    // Uses a stack of mementos for managing changes inside the text editor
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public void saveState(Memento memento){
        // Save new state: Clear a redo stack when a new state is saved
        undoStack.push(memento);
        redoStack.clear();
    }

    // undo operation: push current state to redo stack and return last state from undo stack
    public Memento undo(Memento currentState){
        if (!undoStack.isEmpty()){
            redoStack.push(currentState);
            return undoStack.pop();
        }
        return null;
    }

    // redo operation: return the current state of redo stack and push current state to undo stack
    public Memento redo(Memento currentState){
        if (!redoStack.isEmpty()){
            undoStack.push(currentState);
            return redoStack.pop();
        }
        return null;
    }

}
