package com.practice.ji.protoss;

import com.practice.ji.Protoss;

public class Dragoon extends Protoss {

    public Dragoon(){
        super(3, 15);
    }

    @Override
    public boolean isFlyUnitAttack() {
        return true;
    }
}
