package OOPJava.Game.Classes.Bowmans;

import OOPJava.Game.Classes.Character;

public class Sniper extends Bowman {
    
    int arrows = 20;

    public Sniper(String name ,String team, int x, int y) {
        super(name, team, x, y, 90, 90, 6, 5, 5, 15, 5, 5, 7, 20);
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