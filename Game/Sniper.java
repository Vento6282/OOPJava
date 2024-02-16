package OOPJava.Game;

public class Sniper extends BaseCharacter {
    int arrows = 3;
    public Sniper(String name) {
        super(name);
        this.health -= 10;
        this.healthMax -= 10;  
        this.defense -= 1;      
        this.strength -= 5;     
        this.agility += 10;      
        this.speed += 3;        
        this.range += 9;    
    }

    @Override
    void attack(BaseCharacter target){
        if(arrows !=0){
            target.getDamage(agility);
            arrows--;
        } else {
            target.getDamage(strength);
        } 
    }
}
