package mindustry.campaign;

import java.util.HashSet;
import java.util.Set;

/** Persistent campaign progression for Aether Frontier. */
public final class AetherCampaignState{
    private int currentAct = 1;
    private final Set<Integer> completedActs = new HashSet<>();
    private final Set<String> completedMissions = new HashSet<>();
    private int experience;
    private int gold;
    private int aether;

    public int currentAct(){ return currentAct; }
    public boolean isActUnlocked(int act){ return act >= 1 && (act == 1 || completedActs.contains(act - 1)); }
    public boolean isActComplete(int act){ return completedActs.contains(act); }
    public boolean isMissionComplete(String missionId){ return completedMissions.contains(missionId); }

    public void completeMission(String missionId){ completedMissions.add(missionId); }
    public void completeAct(int act){
        if(act < 1 || act > AetherCampaign.ACT_COUNT) return;
        completedActs.add(act);
        if(act == currentAct && currentAct < AetherCampaign.ACT_COUNT) currentAct++;
    }

    public void reward(int xp, int gold, int aether){
        experience += Math.max(0, xp);
        this.gold += Math.max(0, gold);
        this.aether += Math.max(0, aether);
    }

    public int experience(){ return experience; }
    public int gold(){ return gold; }
    public int aether(){ return aether; }

    public Set<Integer> completedActs(){ return Set.copyOf(completedActs); }
    public Set<String> completedMissions(){ return Set.copyOf(completedMissions); }
}
