package mindustry.campaign;

import java.util.List;

/** Deterministic Act 1 loot definitions. */
public final class AetherAct1Loot {
    public record Drop(String id, String rarity, int quantity) {}

    public static List<Drop> ironScoutCommander(){
        return List.of(
            new Drop("iron_scrap", "COMMON", 100),
            new Drop("aether_shard", "UNCOMMON", 3),
            new Drop("dominion_rifle", "RARE", 1),
            new Drop("scout_armor", "EPIC", 1),
            new Drop("commander_insignia", "LEGENDARY", 1),
            new Drop("aether_core_fragment", "UNIQUE", 1)
        );
    }

    private AetherAct1Loot(){}
}
