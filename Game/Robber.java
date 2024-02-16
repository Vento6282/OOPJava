package OOPJava.Game;

public class Robber extends BaseCharacter {

    public Robber(String name) {
        super(name);
        this.health += 10;
        this.healthMax += 10;
        this.strength -= 10; 
        this.agility += 15; 
        this.speed += 1;
    }

    @Override
    void attack(BaseCharacter target){
        target.getDamage(agility);
    }
}
