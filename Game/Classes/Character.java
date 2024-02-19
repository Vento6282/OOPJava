package OOPJava.Game.Classes;

public abstract class Character {
    protected String name;           // имя
    protected int health;      // здоровье
    protected int healthMax;   // максимальное здоровье
    protected int defensePhysical;       // защита
    protected int defenseMagic;    // магическая защита
    protected int strength;     // сила
    protected int agility;      // ловкость
    protected int intellect;    // интелект
    protected int speed;         // скорость
    protected int range;         // дальность атаки
    
    protected Character(String name, int health, int healthMax, int defensePhysical, int defenseMagic, int strength, int agility, int intellect, int speed, int range){
        this.name = name;
        this.health = health;
        this.healthMax = healthMax;
        this.defensePhysical = defensePhysical;
        this.defenseMagic = defenseMagic;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.speed = speed;
        this.range = range;
    }


    
    protected void attack(Character target){
        target.getPhysicDamage(strength);
    }

    protected void getPhysicDamage(int damage){
        if (damage - defensePhysical <= 0){
            damage = 1;
        } else {
            damage -= defensePhysical;
        }
        this.health -= damage;
    }

    protected void getMagicDamage(int damage){
        if (damage - defenseMagic <= 0){
            damage = 1;
        } else {
            damage -= defenseMagic;
        }
        this.health -= damage;
    }

    public String toString(){
        return this.getClass().getSimpleName() + " " + this.name;
    }
}
