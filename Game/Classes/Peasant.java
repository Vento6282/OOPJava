package OOPJava.Game.Classes;

public class Peasant extends BaseCharacter{

    public Peasant(String name) {
        super(name);
        this.health -= 20;
        this.healthMax -= 20;  
        this.defense -= 3;      
        this.strength -= 5;     
        this.agility += 5;      
        this.speed -= 1;       
    }
}
