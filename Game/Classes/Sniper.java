package OOPJava.Game.Classes;

public class Sniper extends Character {
    
    int arrows = 20;

    public Sniper(String name, int x, int y) {
        super(name, x, y, 90, 90, 6, 5, 5, 15, 5, 5, 7);
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
