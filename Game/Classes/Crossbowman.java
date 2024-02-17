package OOPJava.Game.Classes;

public class Crossbowman extends BaseCharacter{

    int arrows = 20;

    public Crossbowman(String name) {
        super(name);
        this.health -= 10;
        this.healthMax -= 10;  
        this.defense -= 1;      
        this.strength += 5;     
        this.agility += 10;      
        this.speed += 1;        
        this.range += 2;            
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
