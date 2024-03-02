package OOPJava.Game.Classes.Bowmans;

public class Crossbowman extends Bowman{

    int arrows = 20;

    public Crossbowman(String name ,String team, int x, int y) {
        super(name, team, x, y, 90, 90, 7, 5, 10, 20, 20, 3, 5, 5);
    }

    public String getInfo(){
        return "Арбалетчик";
    }
}
