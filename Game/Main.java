package OOPJava.Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import OOPJava.Game.Classes.Character;
import OOPJava.Game.Classes.Bowmans.*;
import OOPJava.Game.Classes.Magicians.*;
import OOPJava.Game.Classes.Melee.*;
import OOPJava.Game.Directories.*;

public class Main {

    public static ArrayList <Character> greenTeam = new ArrayList<>();
    public static ArrayList <Character> blueTeam = new ArrayList<>();
    public static ArrayList <Character> allTeam = new ArrayList<>();
    public static void main(String[] args) {

        createCharacterTeams(10, greenTeam, blueTeam);
        allTeam.addAll(greenTeam);
        allTeam.addAll(blueTeam);
        allTeam.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());
        
        Scanner scanner = new Scanner(System.in);

        while (!isDeadTeams(greenTeam, blueTeam)) {
            View.view();
            scanner.nextLine();
            for (Character character : allTeam) {
                if(!isDeadTeam(greenTeam) && !isDeadTeam(blueTeam)){
                    character.step(blueTeam, greenTeam);
                }
            }
        }
        scanner.close();
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    private static String getClassCharacter(){
        return String.valueOf(Classes.values()[new Random().nextInt(Classes.values().length)]);
    }   

    public static void createCharacterTeams(int sizeTeam, ArrayList<Character> greenTeam, ArrayList<Character> blueTeam){
        for (int i = 1; i <= sizeTeam; i++){
            greenTeam.add(createCharacter("green", i, 1));
            blueTeam.add(createCharacter("blue", i, 10));
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

    static boolean isDeadTeams(ArrayList<Character> greenTeam, ArrayList<Character> blueTeam){
        int check = 0;
        if(isDeadTeam(greenTeam)){
            check += 1;
            System.out.println("Зеленая команда победила!");
        }
        if(isDeadTeam(blueTeam)){
            System.out.println("Синяя команда победила!");
            check += 1;
        }
        if(check > 0){return true;
        }
        else{
            return false;
        }
    }

    static boolean isDeadTeam(ArrayList<Character> team){
        for (Character character : team) {
            if(!character.isDead()){
                return false;
            }
        }
        return true;
    }
}