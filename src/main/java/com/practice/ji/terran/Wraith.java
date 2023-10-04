package com.practice.ji.terran;

import com.practice.ji.Terran;

public class Wraith extends Terran {

    public Wraith() {
        super(3, 10);
    }

    @Override
    public boolean isFly() {
        return true;
    }

    @Override
    public boolean isFlyUnitAttack() {
        return true;
    }
}
