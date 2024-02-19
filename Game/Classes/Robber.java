package OOPJava.Game.Classes;

public class Robber extends Character {

    protected Robber(String name, int health, int healthMax, int defensePhysical, int defenseMagic, int strength,
            int agility, int intellect, int speed, int range) {
        super(name, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed, range);
    }

    @Override
    public void attack(Character target){
        target.getPhysicDamage(agility);
    }
}
