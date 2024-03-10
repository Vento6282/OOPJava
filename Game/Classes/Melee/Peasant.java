package OOPJava.Game.Classes.Melee;

import java.util.ArrayList;

import OOPJava.Game.Classes.Character;
import OOPJava.Game.Classes.Bowmans.Bowman;

public class Peasant extends Character{

    protected boolean isBusy;

    public Peasant(String name ,String team, int x, int y) {
        super(name, team, x, y, 80, 80, 5, 5, 8, 5, 5, 1);
        this.isBusy = false;
    }

    public String getInfo(){
        return "Фермер";
    }

    @Override
    public void step(ArrayList<Character> teamBlue, ArrayList<Character> teamGreen){
        if (!this.isDead() && !isBusy){
            if(team == "blue"){
                if(existClass(teamBlue, "Арбалетчик") || existClass(teamBlue, "Снайпер")){
                    Character bowman = searchBowman(teamBlue);
                    ((Bowman)bowman).setArrows(this);
                }
            } else {
                if(existClass(teamGreen, "Арбалетчик") || existClass(teamGreen, "Снайпер")){
                    Character bowman = searchBowman(teamGreen);
                    ((Bowman)bowman).setArrows(this);
                }           
            }  
        }
        isBusy = false;
    }

    public void step(){
        isBusy = true;
    }

    public Character searchBowman (ArrayList<Character> team){
        ArrayList<Character> bowmans = new ArrayList<>();
        for (Character character : team) { 
            if((character.getInfo() == "Арбалетчик"  && !character.isDead()) || character.getInfo() == "Снайпер"  && !character.isDead()){
                bowmans.add(character);
            }
        }
        int min = ((Bowman)bowmans.get(0)).getArrows();
        for (Character character : bowmans) {
            if(((Bowman)character).getArrows() < min){
                min = ((Bowman)character).getArrows();
            }
        }
        for (Character character : bowmans) {
            if(((Bowman)character).getArrows() == min){
                return character;
            }
        }       
        return bowmans.get(0); // заглушка
    }

    public boolean isBusy(){
        return isBusy;
    }
}
