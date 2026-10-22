package mindustry.campaign;

import java.util.ArrayList;
import java.util.List;

/** Native campaign definition for Aether Frontier Act I: The Last Frontier. */
public final class AetherAct1 {
    public static final String ID = "act_01";
    public static final String TITLE = "The Last Frontier";
    public static final String CHAPTER = "The Awakening";

    public record Objective(String id, String type, String target, int amount, boolean optional) {}
    public record Mission(String id, String title, String story, List<Objective> objectives) {}

    public static List<Mission> missions(){
        return List.of(
            new Mission("act01_m01", "Defend the Village", "Unknown machines attack the frontier village.", List.of(
                new Objective("m01_o01", "SURVIVE", "enemy_wave", 3, false),
                new Objective("m01_o02", "PROTECT", "village_core", 1, false),
                new Objective("m01_o03", "DEFEAT", "scout", 8, false)
            )),
            new Mission("act01_m02", "Secure the Aether Mine", "The attack reveals an Aether deposit beneath the hills.", List.of(
                new Objective("m02_o01", "REACH", "aether_mine", 1, false),
                new Objective("m02_o02", "BUILD", "aether_mine", 1, false),
                new Objective("m02_o03", "PROTECT", "aether_mine", 1, true)
            )),
            new Mission("act01_m03", "The Machine Beneath", "An ancient machine awakens below the frontier ruins.", List.of(
                new Objective("m03_o01", "EXPLORE", "ancient_ruins", 1, false),
                new Objective("m03_o02", "DEFEAT", "elite_guardian", 1, false),
                new Objective("m03_o03", "COLLECT", "crown_fragment", 1, false)
            )),
            new Mission("act01_m04", "Iron Scout Commander", "The Dominion commander arrives to reclaim the Aether deposit.", List.of(
                new Objective("m04_o01", "DEFEND", "frontier_base", 1, false),
                new Objective("m04_o02", "DEFEAT", "iron_scout_commander", 1, false),
                new Objective("m04_o03", "SURVIVE", "boss_phase", 3, false)
            ))
        );
    }

    public static String completionReward(){
        return "500 XP; 1000 gold; 100 Aether; Crown Fragment; Aether Mining technology; Act 02 unlocked";
    }

    private AetherAct1(){}
}
