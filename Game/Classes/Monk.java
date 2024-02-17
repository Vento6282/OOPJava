package OOPJava.Game.Classes;

public class Monk extends BaseCharacter{

    int mana = 100;

    public Monk(String name) {
        super(name);
        this.health -= 10;
        this.healthMax -= 10;
        this.defense -= 2;    
        this.defenseMag += 5;
        this.strength -= 5;
        this.agility -= 5;
        this.intellect += 5;   
        this.range += 4; 
    }

    public void getAttack(BaseCharacter target){
        if(mana >= 10){
            target.getMagicDamage(intellect);
            mana -= 10;
        } else {
            target.getPhysicDamage(strength);
        } 
    }
}