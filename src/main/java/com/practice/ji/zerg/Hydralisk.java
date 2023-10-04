package com.practice.ji.zerg;

import com.practice.ji.Zerg;

public class Hydralisk extends Zerg {

    public Hydralisk(){
        super(3, 7);
    }

    @Override
    public boolean isFlyUnitAttack() {
        return true;
    }
}
