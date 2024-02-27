package OOPJava.Game.Classes.Magicians;


public class Wizard extends Magician{

    int mana = 100;

    public Wizard(String name ,String team, int x, int y) {
        super(name, team, x, y, 80, 80, 5, 10, 5, 5, 20, 1, 100);
    }
    
    public String getInfo(){
        return "Чародей";
    }
}
