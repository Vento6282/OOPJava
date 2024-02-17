package OOPJava.Game.Classes;

public class Spearman extends BaseCharacter {
    public Spearman(String name) {
        super(name);
        this.health += 20;
        this.healthMax += 20;
        this.defense += 1;
        this.strength += 5;
        this.agility -= 1;
    }
}
