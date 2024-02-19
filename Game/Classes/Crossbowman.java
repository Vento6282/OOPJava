package OOPJava.Game.Classes;

public class Crossbowman extends Character{

    int arrows = 20;

    public Crossbowman(String name, int x, int y) {
        super(name, x, y, 90, 90, 7, 5, 10, 10, 5, 4, 5);
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
