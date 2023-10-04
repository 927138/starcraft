package com.practice.ji;

import com.practice.ji.play.BroodSelection;
import com.practice.ji.play.Operator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class GamePlay {

    private static List<Unit> computer = new LinkedList<>();
    private static List<Unit> user = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int userBrood = 0;
        int computerBrood = (int) (Math.random()*3) + 1;

        System.out.println("스타크래프트 게임을 시작하겟습니다.");
        System.out.print("종족을 선택해 주세요. 1~3(P/1, T/2, Z/3) : ");
        userBrood = Integer.parseInt(br.readLine());
        System.out.println("컴퓨터는 랜덤으로 진행...");

        BroodSelection.choice(user, userBrood);
        BroodSelection.choice(computer, computerBrood);
        Operator.print(user, computer);


        while (!computer.isEmpty() && !user.isEmpty()){
            System.out.print("공격 유닛을 선택 : ");
            int attack = Integer.parseInt(br.readLine());
            System.out.print("공격할 유닛을 선택 : ");
            int defense = Integer.parseInt(br.readLine());
            Operator.attack(user, computer, attack, defense);
            Operator.attack(computer, user, (int) (Math.random()*computer.size()), (int) (Math.random() * user.size()));
            Operator.print(user, computer);
        }

        if (user.size() > 0) {
            System.out.println("user victory");
        }else{
            System.out.println("computer victory");
        }

    }

}
