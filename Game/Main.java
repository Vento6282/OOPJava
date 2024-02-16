package OOPJava.Game;

public class Main {
    public static void main(String[] args) {
        BaseCharacter spearman = new Spearman("Vigo");
        BaseCharacter sniper = new Sniper("Helmut");
        System.out.println(spearman.toString());
        sniper.attack(spearman);
        System.out.println(spearman.toString());
        sniper.attack(spearman);
        System.out.println(spearman.toString());
        sniper.attack(spearman);
        System.out.println(spearman.toString());
        sniper.attack(spearman);
        System.out.println(spearman.toString());
    }
}