package com.practice.ji;

public abstract class Unit implements Fly, FlyAttack {

    public abstract void setAttack(int attack);
    public abstract void setDefense(int defense);
    public abstract int getAttack();
    public abstract int getDefense();
}
