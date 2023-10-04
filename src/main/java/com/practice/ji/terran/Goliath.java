package com.practice.ji.terran;

import com.practice.ji.Terran;

public class Goliath extends Terran{

    public Goliath() {
        super(5, 15);
    }

    @Override
    public boolean isFlyUnitAttack() {
        return true;
    }

}