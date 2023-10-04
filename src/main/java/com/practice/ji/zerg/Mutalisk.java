package com.practice.ji.zerg;

import com.practice.ji.Zerg;

public class Mutalisk extends Zerg {

    public Mutalisk(){
        super(2, 8);
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
