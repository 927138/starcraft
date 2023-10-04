package com.practice.ji.zerg;

import com.practice.ji.Zerg;

public class Queen extends Zerg {
    public Queen(){
        super(15, 25);
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
