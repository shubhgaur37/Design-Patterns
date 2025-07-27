package BehavioralDesignPatterns.Memento.Ugly_Code;

public class TraditionalEditorDemo {
    public static void main(String[] args) {
        TextEditorTraditional editor = new TextEditorTraditional("Hello");
        editor.showText(); // Output: Hello
        // User makes a change
        String backup = "Hello"; // Manually keeping the backup 😅
        editor.setText("Hello, World!");
        editor.showText(); // Output: Hello, World!
        // Undo the change by manually restoring the backup
        editor.undo(backup);
        editor.showText(); // Output: Hello
    }
}

/*

Output :
Current text: Hello
Current text: Hello, World!
Current text: Hello

*/

/*
Problems with traditional text editor approach:
1. We try to simulate an undo by manually saving the previous state in a variable.
2. Each time a change is made, we need to manually store the previous state.
3. Every new feature like(multiple undo steps or more operations), requires more backup logic, leading to duplicated and tangled code.
 */