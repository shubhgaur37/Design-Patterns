package CreationalDesignPatterns.Prototype.Good_Code;

public class CharacterFactory {
    private Character prototypeCharacter;

    // Constructor to create a prototype character(default character)
    public CharacterFactory(){
        prototypeCharacter = new Character("Terrorist", 100, 20, 12);
    }

    public Character createCharacterWithNewName(String name){
        // here we can either create a new object using the cloned character or use setters if defined
        Character clonedCharacter = prototypeCharacter.clone();
        // clonedCharacter = new Character(name, prototypeCharacter.getHealth(), prototypeCharacter.getAttackPower(), prototypeCharacter.getLevel());
        // or
        clonedCharacter.setName(name);
        return clonedCharacter;
    }

    public Character createCharacterWithNewHealth(int health){
        // here we can either create a new object using the cloned character or use setters if defined
        Character clonedCharacter = prototypeCharacter.clone();
        // clonedCharacter = new Character(prototypeCharacter.getName(), health, prototypeCharacter.getAttackPower(), prototypeCharacter.getLevel());
        // or
        clonedCharacter.setHealth(health);
        return clonedCharacter;
    }

    public Character createCharacterWithNewAttackPower(int attackPower){
        // here we can either create a new object using the cloned character or use setters if defined
        Character clonedCharacter = prototypeCharacter.clone();
        // clonedCharacter = new Character(prototypeCharacter.getName(), prototypeCharacter.getHealth(), attackPower, prototypeCharacter.getLevel());
        // or
        clonedCharacter.setAttackPower(attackPower);
        return clonedCharacter;
    }

    public Character createCharacterWithNewLevel(int level){
        // here we can either create a new object using the cloned character or use setters if defined
        Character clonedCharacter = prototypeCharacter.clone();
        // clonedCharacter = new Character(prototypeCharacter.getName(), prototypeCharacter.getHealth(), prototypeCharacter.getAttackPower(), level);
        // or
        clonedCharacter.setLevel(level);
        return clonedCharacter;
    }
}
// Summarizing:
// 1. the prototype character acts as a base template, allowing us to quickly create multiple characters.
// 2. Modify only whats necessary for creating new objects using the clone with default values.
// 3. No code duplication: Earlier we had to pass all the parameters again and again for every new method we created.

// Advantages:
// 1. Reduced Code Duplication
// 2. Easier Maintenance
// 3. Easy to scale
// 4. Cleaner and more flexible code