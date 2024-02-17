package OOPJava.Game.Classes;

public class Sniper extends BaseCharacter {
    int arrows = 20;
    public Sniper(String name) {
        super(name);
        this.health -= 10;
        this.healthMax -= 10;  
        this.defense -= 2;      
        this.strength -= 5;     
        this.agility += 10;      
        this.speed += 2;        
        this.range += 3;    
    }

    @Override
    public void attack(BaseCharacter target){
        if(arrows !=0){
            target.getPhysicDamage(agility);
            arrows--;
        } else {
            target.getPhysicDamage(strength);
        } 
    }
}
