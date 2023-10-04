package com.practice.ji.terran;

import com.practice.ji.Terran;

public class BattleCruzer extends Terran {
    public BattleCruzer(){
        super(20, 30);
    }

    @Override
    public boolean isFlyUnitAttack() {
        return true;
    }

    @Override
    public boolean isFly() {
        return true;
    }
}
