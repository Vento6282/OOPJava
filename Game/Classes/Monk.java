package OOPJava.Game.Classes;

public class Monk extends Character{

    int mana = 100;

    public Monk(String name, int x, int y) {
        super(name, x, y, 80, 80, 5, 10, 5, 5, 20, 4, 5);
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
