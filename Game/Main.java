package OOPJava.Game;

import java.util.ArrayList;
import java.util.Random;

import OOPJava.Game.Classes.*;
import OOPJava.Game.Classes.Character;
import OOPJava.Game.Lists.*;

public class Main {
    public static void main(String[] args) {


        
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    private static String getClassCharacter(){
        return String.valueOf(Classes.values()[new Random().nextInt(Classes.values().length-1)]);
    }   

    public void createCharacterTeams(int sizeTeam, ArrayList<Character> redTeam, ArrayList<Character> blueTeam){
        for (int i = 1; i <= sizeTeam; i++){
            redTeam.add(createCharacter());
            blueTeam.add(createCharacter());
        }
    }

    public static Character createCharacter(){
        switch (getClassCharacter()) {
            case "crossbowman":
                Character crossbowman = new Crossbowman(getName(), 90, 90, 5, 5, 10, 10, 5, 4, 6);
                return crossbowman;
            case "monk":
                Character monk = new Crossbowman(getName(), 90, 90, 5, 5, 10, 10, 5, 4, 6);
                return monk;
            case default:
                Character peast = new Crossbowman(getName(), 90, 90, 5, 5, 10, 10, 5, 4, 6);
                return monk;                
        }
    }


    
}