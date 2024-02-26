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

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distanse(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 -x1), 2) + Math.pow((y2 -y1), 2));
    }

    public Position diffPosition(Position positionTarget){
        return new Position(x - positionTarget.getX(), y - positionTarget.getY());
    }
}
