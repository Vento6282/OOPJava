package OOPJava.Game.Classes.Bowmans;

import java.util.ArrayList;

import OOPJava.Game.Classes.Character;

public abstract class Bowman extends Character{

    protected int arrows;

    protected Bowman(String name, String team, int x, int y, int health, int healthMax, int defensePhysical,
            int defenseMagic, int strength, int agility, int intellect, int speed, int range, int arrows) {
        super(name, team, x, y, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed, range);
        this.arrows = arrows;
    }
    
    public void createArrows(){
        this.arrows += 5;
    }

    @Override
    public void step(ArrayList<Character> teamBlue, ArrayList<Character> teamRed) {
        if(!this.isDead() && this.arrows > 0){
            if(this.team == "red"){
                this.attack(searchTarget(teamBlue));
            } else {this.attack(searchTarget(teamRed));}
        }
    }   
}
