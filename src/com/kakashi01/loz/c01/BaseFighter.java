package com.kakashi01.loz.c01;

public class BaseFighter {

    private int hp;

    public void beAttacked(int harm) {
        this.hp -= harm;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public int getHp() {
        return hp;
    }
}
