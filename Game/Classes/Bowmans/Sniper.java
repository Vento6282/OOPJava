package OOPJava.Game.Classes.Bowmans;

public class Sniper extends Bowman {
    
    int arrows = 20;

    public Sniper(String name ,String team, int x, int y) {
        super(name, team, x, y, 90, 90, 6, 5, 5, 20, 20, 3, 7, 5);
    }

    public String getInfo(){
        return "Снайпер";
    }
}
