package com.practice.ji.protoss;

import com.practice.ji.Protoss;

public class Carrier extends Protoss {

    public Carrier(){
        super(25, 40);
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
