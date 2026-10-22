package mindustry.campaign;

import java.util.List;

/** Entry point for the Aether Frontier campaign content layer. */
public final class AetherCampaign {
    public static final int ACT_COUNT = 46;

    public static List<AetherAct1.Mission> act1(){
        return AetherAct1.missions();
    }

    public static boolean isActComplete(int act, int completedMissions){
        if(act != 1) return completedMissions >= 1;
        return completedMissions >= AetherAct1.missions().size();
    }

    public static int nextAct(int act){
        return Math.min(ACT_COUNT, act + 1);
    }

    private AetherCampaign(){}
}
