package com.practice.ji.play;

import com.practice.ji.Unit;
import java.util.List;

public class Operator {

    public static void attack(List<Unit> attack, List<Unit> defense, int attackUnit, int defenseUnit){

        if(attack.isEmpty() || defense.isEmpty()){
            return;
        }

        if (attackUnit < 0 || attackUnit >= attack.size()) {
            System.out.println("존재하지 않는 유닛");
            return;
        }

        if (defenseUnit < 0 || defenseUnit >= defense.size()) {
            System.out.println("공격 할 수 없는 유닛");
            return;
        }

        int getAttack = attack.get(attackUnit).getAttack();
        int getDefense = defense.get(defenseUnit).getDefense();

        if(defense.get(defenseUnit).isFly()) {
            if (attack.get(attackUnit).isFlyUnitAttack()) {
                System.out.println("fly attack");
                defense.get(defenseUnit).setDefense(getDefense - getAttack);
            } else {
                System.out.println("지상유닛은 공중유닛을 공격할 수 없음");
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
        sb.append("computer : ").append(computer.get(0).getBrood()).append("\n");

        for(int i=0; i<computer.size(); i++){
            sb.append(i).append(" ");
            sb.append(computer.get(i)).append("\n");
        }

        sb.append("----------------------------------------------\n");
        sb.append("user : ").append(user.get(0).getBrood()).append("\n");
        for(int i=0; i<user.size(); i++){
            sb.append(i).append(" ");
            sb.append(user.get(i)).append("\n");
        }

        System.out.println(sb);
    }

}
