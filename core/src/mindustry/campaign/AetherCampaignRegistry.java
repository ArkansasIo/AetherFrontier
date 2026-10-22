package mindustry.campaign;

import java.util.List;

/** Central registry for the Aether Frontier story campaign. */
public final class AetherCampaignRegistry {
    public static final String ID = "aether_frontier";
    public static final int MAIN_ACT_COUNT = 46;
    public static final int TARGET_STORY_HOURS = 120;

    public static List<AetherAct1.Mission> act1() {
        return AetherAct1.missions();
    }

    public static boolean isUnlocked(int completedActs, int requestedAct) {
        return requestedAct == 1 || requestedAct <= completedActs + 1;
    }

    private AetherCampaignRegistry() {}
}
