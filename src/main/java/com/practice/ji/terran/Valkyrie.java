package com.practice.ji.terran;

import com.practice.ji.Terran;

public class Valkyrie extends Terran {

    public Valkyrie() {
        super(4, 12);
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
