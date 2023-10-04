package com.practice.ji;

public class Protoss extends Unit{

    private int attack;
    private int defense;

    public Protoss(int attack, int defense){
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public String getBrood() {
        return "Protoss";
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public int getAttack() {
        return this.attack;
    }

    @Override
    public int getDefense() {
        return this.defense;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (현재 방어력 : " + this.defense + ")";
    }

}
