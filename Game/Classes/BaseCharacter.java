package OOPJava.Game.Classes;

public abstract class BaseCharacter {
    protected String name;           // имя
    protected int health = 100;      // здоровье
    protected int healthMax = 100;   // максимальное здоровье
    protected int defense = 5;       // защита
    protected int defenseMag = 5;    // магическая защита
    protected int strength = 10;     // сила
    protected int agility = 10;      // ловкость
    protected int intellect = 10;    // интелект
    protected int speed = 2;         // скорость
    protected int range = 1;         // дальность атаки
    
    protected BaseCharacter(String name){
        this.name = name;
    }
    
    protected void attack(BaseCharacter target){
        target.getPhysicDamage(strength);
    }

    protected void getPhysicDamage(int damage){
        if (damage - defense <= 0){
            damage = 1;
        } else {
            damage -= defense;
        }
        this.health -= damage;
    }

    protected void getMagicDamage(int damage){
        if (damage - defenseMag <= 0){
            damage = 1;
        } else {
            damage -= defenseMag;
        }
        this.health -= damage;
    }

    public String toString(){
        return this.getClass().getSimpleName() + " " + this.name;
    }
}
