package OOPJava.Game;

import OOPJava.Game.Classes.*;

public class Main {
    public static void main(String[] args) {
        BaseCharacter spearman = new Spearman("Vigo");
        BaseCharacter sniper = new Sniper("Helmut");
        BaseCharacter magician = new Magician("Gendalf");
        BaseCharacter crossbowman = new Crossbowman("Jet");
        BaseCharacter monk = new Monk("Sam");
        BaseCharacter robber = new Robber("Rico");
        BaseCharacter peasant = new Peasant("Joe");
        System.out.println(spearman.toString());
        System.out.println(sniper.toString());
        System.out.println(magician.toString());
        System.out.println(crossbowman.toString());
        System.out.println(monk.toString());
        System.out.println(robber.toString());
        System.out.println(peasant.toString());  
    }
}