package OOPJava.Game.Classes.Magicians;

import java.util.ArrayList;

import OOPJava.Game.Classes.Character;

public abstract class Magician extends Character {

    protected int mana;

    protected Magician(String name, String team, int x, int y, int health, int healthMax, int defensePhysical,
            int defenseMagic, int strength, int agility, int intellect, int speed, int range, int mana) {
        super(name, team, x, y, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed, range);
        this.mana = mana;
    }
    
        @Override
    public void step(ArrayList<Character> teamBlue, ArrayList<Character> teamRed) {

    }   
}
