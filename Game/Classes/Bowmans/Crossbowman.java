package OOPJava.Game.Classes.Bowmans;

import OOPJava.Game.Classes.Character;

public class Crossbowman extends Bowman{

    int arrows = 20;

    public Crossbowman(String name ,String team, int x, int y) {
        super(name, team, x, y, 90, 90, 7, 5, 10, 10, 5, 3, 5, 20);
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
