package OOPJava.Game.Classes;

public class Robber extends Character {

    public Robber(String name, int x, int y) {
        super(name, x, y, 110, 110, 8, 5, 10, 15, 5, 6, 1);
    }

    @Override
    public void attack(Character target){
        target.getPhysicDamage(agility);
    }
}
