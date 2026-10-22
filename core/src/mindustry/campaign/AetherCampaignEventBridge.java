package mindustry.campaign;

import mindustry.game.EventType.BlockBuildEndEvent;
import mindustry.game.EventType.SectorCaptureEvent;
import mindustry.game.EventType.Trigger;
import mindustry.game.Events;

/** Bridges live engine events into the Aether Frontier campaign runtime. */
public final class AetherCampaignEventBridge{
    private static boolean installed;

    private AetherCampaignEventBridge(){}

    public static void install(){
        if(installed) return;
        installed = true;

        Events.on(BlockBuildEndEvent.class, event -> {
            if(event.unit != null && event.tile != null){
                AetherMissionRuntime.onBuild(event.tile.block());
            }
        });

        Events.on(SectorCaptureEvent.class, event -> {
            if(event.sector != null && event.sector.isBeingPlayed()){
                AetherMissionRuntime.onSectorCaptured(event.sector);
            }
        });

        Events.run(Trigger.update, AetherMissionRuntime::update);
    }
}
