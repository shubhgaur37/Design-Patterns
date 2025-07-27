package CreationalDesignPatterns.Prototype.Good_Code;

interface Clone{
    Character clone();
}

public class Character implements Clone { // can also use predefined Cloneable interface

    private String name;
    private int health;
    private int attackPower;
    private int level;

    public Character(String name, int health, int attackPower, int level) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.level = level;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getLevel() {
        return level;
    }

    

    // Manual clone implementation
    @Override
    public Character clone() {
        return new Character(this.name, this.health, this.attackPower, this.level); 
        // shallow copy: using references(for non-primitive types) without going deep into the object
        // deep copy can also be utilised here, i.e. its irrelevant to the design pattern
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', health=" + health +
               ", attackPower=" + attackPower + ", level=" + level + '}';
    }

}
