package jp.ac.uryukyu.ie.e245732;

/**
 * Warriorクラス。
 */
public class Warrior extends Hero{
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    /**
     * スキルで相手に攻撃するメソッド。
     * attackの150％のダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attackWithWeponSkill(LivingThing opponent){
        if(isDead() == false){
            int damage = (int)(getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
