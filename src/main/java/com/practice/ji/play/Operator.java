package com.practice.ji.play;

import com.practice.ji.Unit;
import java.util.List;

public class Operator {

    public static void attack(List<Unit> attack, List<Unit> defense, int attackUnit, int defenseUnit){
        if(attackUnit < 0 || attackUnit >= attack.size())
            return;
        if(defenseUnit < 0 || defenseUnit >= defense.size())
            return;

        if(attack.isEmpty() || defense.isEmpty())
            return;

        int getAttack = attack.get(attackUnit).getAttack();
        int getDefense = defense.get(defenseUnit).getDefense();

        if(defense.get(defenseUnit).isFly()) {
            if (attack.get(attackUnit).isFlyUnitAttack()) {
                System.out.println("fly attack");
                defense.get(defenseUnit).setDefense(getDefense - getAttack);
            } else {
                System.out.println("공격할 수 없습니다.");
            }
        }else{
            System.out.println("walk attack");
            defense.get(defenseUnit).setDefense(getDefense - getAttack);
        }

        if(defense.get(defenseUnit).getDefense() < 1) defense.remove(defenseUnit);

    }

    public static void print(List<Unit> user, List<Unit> computer){

        if(user.isEmpty() || computer.isEmpty()){
            System.out.println("게임종료");
            return;
        }

        StringBuilder sb = new StringBuilder();

        sb.append("----------------------------------------------\n");
        sb.append("computer  ").append("\n");

        for(int i=0; i<computer.size(); i++){
            sb.append(i).append(" ");
            sb.append(computer.get(i)).append("\n");
        }

        sb.append("----------------------------------------------\n");
        sb.append("user ").append("\n");
        for(int i=0; i<user.size(); i++){
            sb.append(i).append(" ");
            sb.append(user.get(i)).append("\n");
        }

        System.out.println(sb);
    }

}
