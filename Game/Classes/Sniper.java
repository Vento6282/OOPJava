package OOPJava.Game.Classes;

public class Sniper extends Character {
    
    int arrows = 20;

    protected Sniper(String name, int health, int healthMax, int defensePhysical, int defenseMagic, int strength,
            int agility, int intellect, int speed, int range) {
        super(name, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed, range);
    }

    @Override
    public void attack(Character target){
        if(arrows !=0){
            target.getPhysicDamage(agility);
            arrows--;
        } else {
            target.getPhysicDamage(strength);
        } 
    }
}
