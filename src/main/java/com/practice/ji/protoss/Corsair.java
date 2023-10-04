package com.practice.ji.protoss;

import com.practice.ji.Protoss;

public class Corsair extends Protoss {

    public Corsair(){
        super(4, 12);
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
