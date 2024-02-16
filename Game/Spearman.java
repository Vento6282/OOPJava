package OOPJava.Game;

public class Spearman extends BaseCharacter {

    int spear = 1;   

    public Spearman(String name) {
        super(name);
        this.health += 20;
        this.healthMax += 20;
        this.defense += 2;
        this.strength += 5;
        this.agility -= 1;
        this.speed -= 1;
        this.range += 1;
    }
}
