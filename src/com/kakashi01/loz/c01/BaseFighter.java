package com.kakashi01.loz.c01;

/**
 * 线程安全的战斗对象
 */
public class BaseFighter {

    private int hp;

    public synchronized void beAttacked(int harm) {
        this.hp -= harm;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public synchronized int getHp() {
        return hp;
    }
}
