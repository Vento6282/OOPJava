package OOPJava.Game.Classes.Bowmans;

import java.util.ArrayList;

import OOPJava.Game.Classes.Character;
import OOPJava.Game.Classes.Melee.Peasant;

public abstract class Bowman extends Character{

    protected int arrows;

    protected Bowman(String name, String team, int x, int y, int health, int healthMax, int defensePhysical,
            int defenseMagic, int strength, int agility, int intellect, int speed, int range, int arrows) {
        super(name, team, x, y, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed);
        this.arrows = arrows;
    }
    
    @Override
    public void step(ArrayList<Character> teamBlue, ArrayList<Character> teamGreen) {
        if(team == "green"){
            if (!isDead() && arrows == 0 && existPeasant(teamGreen)){
                Character character = searchPeasant(teamGreen);
                ((Peasant)character).step();
                setArrows(character);
            } 
            if(!isDead() && arrows > 0){
                this.attack(searchTarget(teamBlue));
                arrows--;
            }
        }
        if(team == "blue"){
            if (!isDead() && arrows == 0 && existPeasant(teamBlue)){
                Character character = searchPeasant(teamBlue);
                ((Peasant)character).step();
                setArrows(character);
            }  
            if(!isDead() && arrows > 0){
                this.attack(searchTarget(teamGreen));
                arrows--;
            }   
        }
    }   
    @Override
    public String toString(){
        return super.toString()+ " arrows: " + this.arrows; 
    }

    public int getArrows(){
        return arrows;
    }

    public Character searchPeasant(ArrayList<Character> team){
        for (Character character : team) { 
            if((character.getInfo() == "Фермер"  && !character.isDead()) && !((Peasant)character).isBusy() ){
                return character;
            }
        }
        Character character = null;
        return character;        
    }
    
    public boolean existPeasant(ArrayList<Character> team){
        for (Character character : team) {
            if(character.getInfo() == "Фермер" && !character.isDead() && !((Peasant)character).isBusy()){
                return true;
            }
        }
        return false;
    }

    public void setArrows(Character character){
        arrows += 1;
    }
}
