package com.practice.ji.play;

import com.practice.ji.Unit;
import com.practice.ji.protoss.Carrier;
import com.practice.ji.protoss.Corsair;
import com.practice.ji.protoss.Dragoon;
import com.practice.ji.protoss.HighTempler;
import com.practice.ji.protoss.Scout;
import com.practice.ji.protoss.Zealot;
import com.practice.ji.terran.BattleCruzer;
import com.practice.ji.terran.Goliath;
import com.practice.ji.terran.Marine;
import com.practice.ji.terran.Tank;
import com.practice.ji.terran.Valkyrie;
import com.practice.ji.terran.Wraith;
import com.practice.ji.zerg.Guardian;
import com.practice.ji.zerg.Hydralisk;
import com.practice.ji.zerg.Mutalisk;
import com.practice.ji.zerg.Queen;
import com.practice.ji.zerg.Ultralisk;
import com.practice.ji.zerg.Zergling;
import java.util.List;

public class BroodSelection {

    public static void choice(List<Unit> brood, int choice){

        switch (choice){
            case 1:
                protossInit(brood);
                break;
            case 2:
                terranInit(brood);
                break;
            case 3:
                zergInit(brood);
                break;
            default:
                System.out.println("잘못된 입력으로 종료됩니다.");
                break;
        }


    }
    private static void protossInit (List<Unit> proto){

        if(proto == null) return;

        for(int i=0; i<4; i++){
            int rand = (int) (Math.random() * 6);

            switch (rand){
                case 0:
                    proto.add(new Corsair());
                    break;
                case 1:
                    proto.add(new Dragoon());
                    break;
                case 2:
                    proto.add(new HighTempler());
                    break;
                case 3:
                    proto.add(new Scout());
                    break;
                case 4:
                    proto.add(new Zealot());
                    break;
                case 5:
                    proto.add(new Carrier());
                    break;
            }
        }
    }

    private static void zergInit(List<Unit> zerg){

        if(zerg == null) return;

        for(int i=0; i<8; i++){
            int rand = (int) (Math.random()*6);

            switch (rand){
                case 0:
                    zerg.add(new Zergling());
                    break;
                case 1:
                    zerg.add(new Guardian());
                    break;
                case 2:
                    zerg.add(new Hydralisk());
                    break;
                case 3:
                    zerg.add(new Mutalisk());
                    break;
                case 4:
                    zerg.add(new Ultralisk());
                    break;
                case 5:
                    zerg.add(new Queen());
                    break;
            }

        }

    }

    private static void terranInit(List<Unit> terran){

        if(terran == null) return;

        for(int i=0; i<5; i++){
            int rand = (int) (Math.random()*6);

            switch (rand){
                case 0:
                    terran.add(new Goliath());
                    break;
                case 1:
                    terran.add(new Marine());
                    break;
                case 2:
                    terran.add(new Tank());
                    break;
                case 3:
                    terran.add(new Valkyrie());
                    break;
                case 4:
                    terran.add(new Wraith());
                    break;
                case 5:
                    terran.add(new BattleCruzer());
                    break;
            }
        }
    }
}
