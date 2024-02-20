package OOPJava.Game.Classes.Melee;

import OOPJava.Game.Classes.Character;

public class Robber extends Melee {

    public Robber(String name ,String team, int x, int y) {
        super(name, team, x, y, 110, 110, 8, 5, 10, 15, 5, 6, 1);
    }

    @Override
    public void attack(Character target){
        target.getPhysicDamage(agility);
    }
}
