package OOPJava.Game.Classes.Magicians;

import OOPJava.Game.Classes.Character;

public class Wizard extends Magician{

    int mana = 100;

    public Wizard(String name ,String team, int x, int y) {
        super(name, team, x, y, 80, 80, 5, 10, 5, 5, 20, 4, 5, 100);
    }
    
    public void getAttack(Character target){
        if(mana >= 10){
            target.getMagicDamage(intellect);
            mana -= 10;
        } else {
            target.getPhysicDamage(strength);
        } 
    }
}