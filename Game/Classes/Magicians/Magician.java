package OOPJava.Game.Classes.Magicians;

import java.util.ArrayList;

import OOPJava.Game.Classes.Character;

public abstract class Magician extends Character {

    protected int mana;

    protected Magician(String name, String team, int x, int y, int health, int healthMax, int defensePhysical,
            int defenseMagic, int strength, int agility, int intellect, int speed, int mana) {
        super(name, team, x, y, health, healthMax, defensePhysical, defenseMagic, strength, agility, intellect, speed);
        this.mana = mana;
    }
    
    @Override
    public void step (ArrayList<Character> teamBlue, ArrayList<Character> teamGreen) {
        if (!isDead()) {
            if (team == "green") {
                if (diedMoreThree(teamGreen)) {
                    if (mana >= 10) {
                        Character diedCharacter = searchDiedCharacter(teamGreen);
                        diedCharacter.setHealth(healthMax);
                        mana -= 10;
                        System.out.println(name + " воскресил " + diedCharacter.getName());
                    } else
                        mana++;
                } else if (mana >= 2 && existHurtCharacters(teamGreen)) {
                    Character hurtCharacter = searchHurtCharacters(teamGreen);
                    if (hurtCharacter.getHealth() + intellect > hurtCharacter.getHealthMax()) {
                        hurtCharacter.setHealth(hurtCharacter.getHealthMax());
                    } else {
                        hurtCharacter.setHealth(hurtCharacter.getHealth() + intellect);
                    }
                    System.out.println(name + " вылечил " + hurtCharacter.getName());
                    mana -= 2;
                } else if ((mana < 2 || !existHurtCharacters(teamGreen))) {
                    mana++;
                }
            } else {
                if (diedMoreThree(teamBlue)) {
                    if (mana >= 10) {
                        Character diedCharacter = searchDiedCharacter(teamBlue);
                        diedCharacter.setHealth(healthMax);
                        mana -= 10;
                        System.out.println(name + " воскресил " + diedCharacter.getName());
                    } else
                        mana++;
                } else if (mana >= 2 && existHurtCharacters(teamBlue)) {
                    Character hurtCharacter = searchHurtCharacters(teamBlue);
                    if (hurtCharacter.getHealth() + intellect > hurtCharacter.getHealthMax()) {
                        hurtCharacter.setHealth(hurtCharacter.getHealthMax());
                    } else {
                        hurtCharacter.setHealth(hurtCharacter.getHealth() + intellect);
                    }
                    mana -= 2;
                } else if ((mana < 2 || !existHurtCharacters(teamBlue))) {
                    mana++;
                }
            }
        }
    }
    public void createMana(){
        this.mana += 30;
    }
    public boolean existHurtCharacters(ArrayList<Character> team){
        for (Character character : team) {
            if(!character.isDead() && character.getHealthMax() > getHealth()){
                System.out.println("Нашёл,что есть кого лечить");
                return true;
            }
        }
        System.out.println("Не нашёл кого вылечить");
        return false;
    }

    public Character searchHurtCharacters(ArrayList<Character> team){
        Character hurtCharacter = team.get(0);
        int diffHealth = team.get(0).getHealthMax() - team.get(0).getHealth() ;
        for (Character character : team) {
            if (!character.isDead() && character.getHealthMax() - character.getHealth() > diffHealth){
                hurtCharacter = character;
                diffHealth =  character.getHealthMax() - character.getHealth();
            }
        }
        return hurtCharacter;
    }

    public boolean diedMoreThree(ArrayList <Character> team){
        int count = 0;
        for (Character character : team) {
            if(character.isDead()){
                count += 1;
            }
        }
        if(count >= 3)            
            return true;
        else return false;
    }

    @Override
    public String toString(){
        return super.toString()+ " mana: " + this.mana; 
    }

    public Character searchDiedCharacter(ArrayList<Character> team){
        for (Character character : team) {
            if (character.isDead()){
                return character;                
            }
        }
        return team.get(0); // заглушка
    }
}
