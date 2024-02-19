package OOPJava.Game.Classes;

public class Wizard extends Character{

    int mana = 100;

    protected Wizard(String name, int health, int healthMax, int defensePhysical, int defenseMagic, int strength, int agility, int intellect, int speed, int range) {
        super(name, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed, range);
    }
    
    public void getAttack(Character target){
        if(mana >= 10){
            target.getMagicDamage(intellect);
            mana -= 10;
        } else {
            target.getPhysicDamage(strength);
        } 
    }
}
