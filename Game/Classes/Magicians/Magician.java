package OOPJava.Game.Classes.Magicians;

import java.util.ArrayList;

import OOPJava.Game.Classes.Character;

public abstract class Magician extends Character {

    protected int mana;

    protected Magician(String name, String team, int x, int y, int health, int healthMax, int defensePhysical,
            int defenseMagic, int strength, int agility, int intellect, int speed, int mana) {
        super(name, team, x, y, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed);
        this.mana = mana;
    }
    
    public void attack(Character target){
        if(mana >= 10){
            target.getMagicDamage(intellect);

            mana -= 10;
        }
    }

    public void createMana(){
        this.mana += 30;
    }

    public void step(ArrayList<Character> teamBlue, ArrayList<Character> teamGreen) {
        if(!this.isDead() && this.mana >= 10){
            if(this.team == "green"){
                this.attack(searchTarget(teamBlue));
            } else {this.attack(searchTarget(teamGreen));}
        } else if ((!this.isDead() && this.mana == 0)){
            createMana();
        }
    }
}
