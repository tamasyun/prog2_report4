import jp.ac.uryukyu.ie.e245732.*;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 100, 5);
        Warrior warrior = new Warrior("戦士", 150, 10);
        Enemy enemy = new Enemy("スライム", 200, 10);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            // hero.attack(enemy);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了") ;
    }
}