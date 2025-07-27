package CreationalDesignPatterns.Prototype.Ugly_Code;

public class CharacterFactory {
    // Too many methods for every small change
    public Character createCharacterWithNewName(String name) {
        return new Character(name, 100, 50, 1);
    }

    public Character createCharacterWithNewLevel(int level) {
        return new Character("DefaultName", 100, 50, level);
    }

    public Character createCharacterWithNewAttackPower(int attackPower) {
        return new Character("DefaultName", 100, attackPower, 1);
    }

    public Character createCharacterWithNewHealth(int health) {
        return new Character("DefaultName", health, 50, 1);
    }
    // More and more methods for every possible variation...
}


// Issues with the above approach:
// 1. Code Duplication: Everytime we need a new character , we need to repeat the same code modifying just one or two values.
// 2. Inefficient and Hard to scale: If we have 100's of characters with slight variations, we end up writing many similar methods. Also, if we need
// to add a new property we will need to modify the object creation logic in each of the methods.