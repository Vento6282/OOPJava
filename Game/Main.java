package OOPJava.Game;

import java.util.ArrayList;
import java.util.Random;

import OOPJava.Game.Classes.*;
import OOPJava.Game.Classes.Character;
import OOPJava.Game.Directories.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <Character> teamRed = new ArrayList<>();
        ArrayList <Character> teamBlue = new ArrayList<>();
        createCharacterTeams(5, teamRed, teamBlue);
        System.out.println(teamRed);
        System.out.println(teamBlue);

        Character sniper = new Sniper(getName(), 0, 0);
        Character wizard = new Wizard(getName(), 2, 2);

    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    private static String getClassCharacter(){
        return String.valueOf(Classes.values()[new Random().nextInt(Classes.values().length)]);
    }   

    public static void createCharacterTeams(int sizeTeam, ArrayList<Character> teamRed, ArrayList<Character> teamBlue){
        for (int i = 1; i <= sizeTeam; i++){
            teamRed.add(createCharacter(0, i-1));
            teamBlue.add(createCharacter(9, i-1));
        }
    }

    public static Character createCharacter(int x, int y){
        switch (getClassCharacter()) {
            case "crossbowman":
                Character crossbowman = new Crossbowman(getName(), x, y);
                return crossbowman;
            case "monk":
                Character monk = new Monk(getName(), x, y);
                return monk;
            case "robber":
                Character robber = new Robber(getName(), x, y);
                return robber;
            case "sniper":
                Character sniper = new Sniper(getName(), x, y);
                return sniper;            
            case "spearman":
                Character spearman = new Spearman(getName(), x, y);
                return spearman;   
            case "wizard":
                Character wizard = new Wizard(getName(), x, y);
                return wizard;           
            default:
                Character peasant = new Peasant(getName(), x, y);
                return peasant;                
        }
    }
}