package OOPJava.Game.Classes.Magicians;

public class Monk extends Magician{

    public Monk(String name ,String team, int x, int y) {
        super(name, team, x, y, 80, 80, 5, 10, 5, 5, 2, 1, 10);
    }

    public String getInfo(){
        return "Монах";
    }
}
