package OOPJava.Game.Classes.Melee;

import java.util.ArrayList;

import OOPJava.Game.Position;
import OOPJava.Game.Classes.Character;

public abstract class Melee extends Character{

    protected Melee(String name, String team, int x, int y, int health, int healthMax, int defensePhysical,
            int defenseMagic, int strength, int agility, int intellect, int speed, int range) {
        super(name, team, x, y, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed, range);
    }
    
    @Override
    public void step(ArrayList<Character> teamBlue, ArrayList<Character> teamRed) {
        if(!this.isDead()){
            Character target = null;
            if(team == "red"){
                target = searchTarget(teamBlue);
            } else {
                target = searchTarget(teamRed);
            }
            System.out.println(position.distanse(this.position.getX(), this.position.getY(), target.position.getX(), target.position.getY()));
            if(position.distanse(this.position.getX(), this.position.getY(), target.position.getX(), target.position.getY()) < 2){
                attack(target); return;
            } else {
                int x = 0;
                int y = 0;
                Position diff = position.diffPosition(target.position);
                if (Math.abs(diff.getX()) > Math.abs(diff.getY())){
                    if(diff.getX() > 0){
                        x = 1;
                    } else if (diff.getX() < 0){
                        x = -1;
                    }  
                } else { 
                    if(diff.getY() > 0){
                        y = 1;
                    } else if (diff.getY() < 0){
                        y = -1;
                    }
                }
                if(team == "red"){
                    for (Character character : teamRed) {
                        if(character.position.getX() == position.getX() - x && character.position.getY() == position.getY() - y && !character.isDead()){return;}
                    }
                } else {
                    for (Character character : teamBlue) {
                        if(character.position.getX() == position.getX() - x && character.position.getY() == position.getY() - y && !character.isDead()){return;}
                    }
                }
                position.setX(position.getX() - x);
                position.setY(position.getY() - y);
            }
        }
    }  
}
