package com.practice.ji;

public interface FlyAttack {
    default boolean isFlyUnitAttack(){
        return false;
    }
}
