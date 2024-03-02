package OOPJava.Game.Classes;

import java.util.ArrayList;
import java.util.HashMap;

import OOPJava.Game.Position;

public abstract class Character implements Step{

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
    public Position position;       // позиция

    
    protected Character(String name, String team, int x, int y, int health, int healthMax, int defensePhysical, int defenseMagic, int strength, int agility, int intellect, int speed){
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
    }

    public void attack(Character target){
        target.getPhysicDamage(strength);
        System.out.println(name + " атаковал " + target.name + " с силой " + (strength));
    }

    public void getPhysicDamage(int damage){
        if (damage - defensePhysical <= 0){
            damage = 1;
        } else {
            damage -= defensePhysical;
        }
        if(health - damage < 0)
            health = 0;
        else
            this.health -= damage;
    }

    public void getMagicDamage(int damage){
        if (damage - defenseMagic <= 0){
            damage = 1;
        } else {
            damage -= defenseMagic;
        }
        if(health - damage < 0)
            health = 0;
        else
            this.health -= damage;
    }

    public boolean isDead(){
        if(this.health == 0){return true;}
        else {return false;}
    }

    public String toString(){
        return   this.getClass().getSimpleName()+ " " + this.name + " HP: " + this.health; 
    }

    public Character searchTarget(ArrayList<Character> targetTeam){
        HashMap<Character, Double> listDistanse = new HashMap<>();
        Double min = 10000.0;;
        for (Character character : targetTeam) {
            Double distanse = position.distanse(this.position.getX(), this.position.getY(), character.position.getX(), character.position.getY());
            if (distanse <= min && !character.isDead()){min = distanse;}
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
    
    public Integer getSpeed(){
        return this.speed;
    }

    public String getInfo(){
        return "";
    }

    public String getTeam(){
        return this.team;
    }

    public boolean existClass(ArrayList<Character> team, String needClass){
        for (Character character : team) {
            if(character.getInfo() == needClass && !character.isDead()){
                return true;
            }
        }
        return false;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getHealthMax(){
        return healthMax;
    }

    public void setHealth(int health){
        this.health = health;
    }
 }
