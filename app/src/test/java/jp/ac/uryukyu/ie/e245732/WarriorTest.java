package jp.ac.uryukyu.ie.e245732;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * attackWithWeponSkillにおいてattackの150%を固定ダメージとして与えられているか検証。
     * 検証手順
     *  (1) 戦士と敵を準備。敵のHPはすぐに死なない程度に大きいものとする。
     *  (2) 戦士がウェポンスキルを発動させる。s
     *      敵のHPが攻撃前からattackの1.5倍減っていることを期待。
     *      これを3回検証する。
     */
    @Test
    public void testAttackWithWeponSkill() {
        int attack = 10;
        int defaultEnemyHp = 1000;
        Warrior demoWarrior = new Warrior("デモ戦士", 1, attack);
        Enemy slime = new Enemy("スライムもどき", defaultEnemyHp, 0);

        int expectedDamage = (int)(attack * 1.5);
        int lastEnemyHp;
        for(int i = 0; i < 3; i++){
            lastEnemyHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(expectedDamage, lastEnemyHp - slime.getHitPoint());
        }
    }
}
