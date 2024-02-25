package OOPJava.Game;

import java.util.ArrayList;
import java.util.Random;

import OOPJava.Game.Classes.Character;
import OOPJava.Game.Classes.Bowmans.*;
import OOPJava.Game.Classes.Magicians.*;
import OOPJava.Game.Classes.Melee.*;
import OOPJava.Game.Directories.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <Character> teamRed = new ArrayList<>();
        ArrayList <Character> teamBlue = new ArrayList<>();
        createCharacterTeams(5, teamRed, teamBlue);
        ArrayList <Character> allTeams = new ArrayList<>();
        allTeams.addAll(teamRed);
        allTeams.addAll(teamBlue);
        allTeams.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());
        System.out.println(allTeams);
        System.out.println();

        teamRed.add(new Sniper(getName(), "red", 0, 5));
        teamBlue.add(new Monk(getName(), "blue", 5, 0));
        System.out.println("До хода снайпера:");
        System.out.println(teamBlue.get(5).toString()); 
        teamRed.get(5).step(teamBlue, teamRed);
        System.out.println("После хода снайпера:");  
        System.out.println(teamBlue.get(5).toString()); 
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    private static String getClassCharacter(){
        return String.valueOf(Classes.values()[new Random().nextInt(Classes.values().length)]);
    }   

    public static void createCharacterTeams(int sizeTeam, ArrayList<Character> teamRed, ArrayList<Character> teamBlue){
        for (int i = 1; i <= sizeTeam; i++){
            teamRed.add(createCharacter("red", 0, i-1));
            teamBlue.add(createCharacter("blue", 9, i-1));
        }
    }

    public static Character createCharacter(String team, int x, int y){
        switch (getClassCharacter()) {
            case "crossbowman":
                Character crossbowman = new Crossbowman(getName(), team, x, y);
                return crossbowman;
            case "monk":
                Character monk = new Monk(getName(), team, x, y);
                return monk;
            case "robber":
                Character robber = new Robber(getName(), team, x, y);
                return robber;
            case "sniper":
                Character sniper = new Sniper(getName(), team, x, y);
                return sniper;            
            case "spearman":
                Character spearman = new Spearman(getName(), team, x, y);
                return spearman;   
            case "wizard":
                Character wizard = new Wizard(getName(), team, x, y);
                return wizard;           
            default:
                Character peasant = new Peasant(getName(), team, x, y);
                return peasant;
        }
    }
}