package mindustry.campaign;

/** Initializes Aether Frontier campaign integrations once during engine startup. */
public final class AetherCampaignBootstrap{
    private static boolean initialized;

    private AetherCampaignBootstrap(){}

    public static void initialize(){
        if(initialized) return;
        initialized = true;
        AetherCampaignEventBridge.install();
    }
}
