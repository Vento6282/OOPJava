package OOPJava.Game.Classes;

import java.util.ArrayList;
import java.util.HashMap;

import OOPJava.Game.Position;

public abstract class Character {

    protected String name;          // имя
    protected String team;          // команда
    protected int health;           // здоровье
    protected int healthMax;        // максимальное здоровье
    protected int defensePhysical;  // защита
    protected int defenseMagic;     // магическая защита
    protected int strength;         // сила
    protected int agility;          // ловкость
    protected int intellect;        // интелект
    protected int speed;            // скорость
    protected int range;            // дальность атаки
    public Position position;

    
    protected Character(String name, String team, int x, int y, int health, int healthMax, int defensePhysical, int defenseMagic, int strength, int agility, int intellect, int speed, int range){
        this.name = name;
        this.team = team;
        this.position = new Position(x, y);
        this.health = health;
        this.healthMax = healthMax;
        this.defensePhysical = defensePhysical;
        this.defenseMagic = defenseMagic;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.speed = speed;
        this.range = range;
    }

    public void attack(Character target){
        target.getPhysicDamage(strength);
    }

    public void getPhysicDamage(int damage){
        if (damage - defensePhysical <= 0){
            damage = 1;
        } else {
            damage -= defensePhysical;
        }
        this.health -= damage;
    }

    public void getMagicDamage(int damage){
        if (damage - defenseMagic <= 0){
            damage = 1;
        } else {
            damage -= defenseMagic;
        }
        this.health -= damage;
    }

    public String toString(){
        return this.getClass().getSimpleName() + " " + this.name + " (" + this.position.getX() + "," + this.position.getY() + ")"; 
    }

    public Character searchTarget(ArrayList<Character> targetTeam){
        HashMap<Character, Double> listDistanse = new HashMap<>();
        Double min = Position.searchPosition(this.position.getX(), this.position.getY(), targetTeam.get(0).position.getX(), targetTeam.get(0).position.getY());
        for (Character character : targetTeam) {
            Double distanse = Position.searchPosition(this.position.getX(), this.position.getY(), character.position.getX(), character.position.getY());
            if (distanse <= min){min = distanse;}
            listDistanse.put(character, distanse);
        }
        Character result = null;
        for (Character character : listDistanse.keySet()) {
            if (listDistanse.get(character) == min){
                result = character;
                
            };
        }
        return result;
    }

}
