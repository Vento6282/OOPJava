package OOPJava.Game;

public class Position {
    int x;
    int y;
    
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public static double searchPosition(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 -x1), 2) + Math.pow((y2 -y1), 2));
    }
}
