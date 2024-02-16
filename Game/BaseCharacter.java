package OOPJava.Game;

public abstract class BaseCharacter {
    String name;
    int health = 50; // здоровье
    int protection;  // защита
    int strength;    // сила
    int agility;     // ловкость
    int intellect;   // интелект
    int speed;       // скорость
    
    public BaseCharacter(String name){
        this.name = name;
    }

}
