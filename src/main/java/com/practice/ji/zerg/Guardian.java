package com.practice.ji.zerg;

import com.practice.ji.Zerg;

public class Guardian extends Zerg {

    public Guardian(){
        super(3, 6);
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
