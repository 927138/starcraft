package com.practice.ji.protoss;

import com.practice.ji.Protoss;

public class Scout extends Protoss {

    public Scout(){
        super(5, 10);
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
