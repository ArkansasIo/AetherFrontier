package mindustry.rpg;

/** Buff/debuff state shared by RTS units and RPG characters. */
public record AetherStatusEffect(String id, String name, boolean buff, float durationSeconds, float magnitude) {
    public static AetherStatusEffect buff(String id, String name, float duration, float magnitude) {
        return new AetherStatusEffect(id, name, true, duration, magnitude);
    }
    public static AetherStatusEffect debuff(String id, String name, float duration, float magnitude) {
        return new AetherStatusEffect(id, name, false, duration, magnitude);
    }
}
