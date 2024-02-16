package OOPJava.Game;

public abstract class BaseCharacter {
    String name;          // имя
    int health = 100;     // здоровье
    int healthMax = 100;  // максимальное здоровье
    int defense = 5;      // защита
    int strength = 5;     // сила
    int agility = 5;      // ловкость
    int intellect = 5;    // интелект
    int speed = 3;        // скорость
    int range = 1;        // дальность атаки
    
    public BaseCharacter(String name){
        this.name = name;
    }
    
    void attack(BaseCharacter target){
        target.getDamage(strength);
    }

    void getDamage(int damage){
        if (damage - defense <= 0){
            damage = 1;
        } else {
            damage -= defense;
        }
        this.health -= damage;
    }

    public String toString(){
        return this.getClass().getSimpleName() + " " + this.name + " : hp " + this.health;
    }
}
