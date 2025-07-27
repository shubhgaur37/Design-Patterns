package BehavioralDesignPatterns.Memento.Good_Code;

public class Main {
    public static void main(String[] args) {
        // Initialise text editor and history
        TextEditor editor = new TextEditor();
        EditorHistory editorHistory = new EditorHistory();

        // set the text multiple times and save the state
        editor.setText("Hello");
        editorHistory.saveState(editor.save());

        editor.setText("Hello World!");
        editorHistory.saveState(editor.save());
        
        editor.setText("Hello World! : Welcome to this new tutorial");
        editorHistory.saveState(editor.save());
        
        editor.setText("Hello World! : Welcome to this new tutorial of Memento Pattern");
        editorHistory.saveState(editor.save());
        
        editor.setText("Hello World! : Welcome to this new tutorial of Memento Pattern using a text editor");
        editorHistory.saveState(editor.save());
        
        editor.setText("Hello World! : Welcome to this new tutorial of Memento Pattern using a text editor usecase");

        System.out.println("Current State :"+ editor.getText());

        // Undo the last changes
        Memento lastState = editorHistory.undo(editor.save());
        
        if (lastState != null){
            editor.restore(lastState);
            System.out.println("After Undo: "+ editor.getText());
        }

        // Redo the undone changes

        Memento redoState = editorHistory.redo(editor.save());
            if (redoState != null){
            editor.restore(redoState);
            System.out.println("After Redo: "+ editor.getText());
        }

    }
}

/* Benefits of Using this pattern:
1. Encapsulated State: Stores an object's state without exposing its internals.
2. Simplified Undo: Easily supports multi-level undo and redo operations.
3. Separation of Concerns: Keeps state management separate from core logic.
4. Effortless Recovery: Enables quick restoration of previous states.
 */