package OOPJava.Game.Classes.Melee;

import OOPJava.Game.Classes.Character;

public abstract class Melee extends Character{

    protected Melee(String name, String team, int x, int y, int health, int healthMax, int defensePhysical,
            int defenseMagic, int strength, int agility, int intellect, int speed, int range) {
        super(name, team, x, y, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed, range);
    }
    
}
