package mindustry.rpg;

/** Core RPG/MMORPG attributes and derived combat statistics. */
public final class AetherStats {
    public int strength, dexterity, constitution, intelligence, wisdom;
    public int vitality, spirit, luck, willpower, charisma;

    public int maxHealth() { return vitality * 15 + constitution * 10; }
    public int maxMana() { return intelligence * 12 + spirit * 8; }
    public int attack() { return strength * 3 + dexterity; }
    public int defense() { return constitution * 2 + vitality; }
    public int magicAttack() { return intelligence * 3 + wisdom; }
    public int magicDefense() { return wisdom * 2 + spirit; }
    public int criticalChance() { return Math.max(0, luck); }
    public int evasion() { return Math.max(0, dexterity / 2 + luck / 4); }

    public AetherStats copy() {
        AetherStats s = new AetherStats();
        s.strength=strength; s.dexterity=dexterity; s.constitution=constitution;
        s.intelligence=intelligence; s.wisdom=wisdom; s.vitality=vitality;
        s.spirit=spirit; s.luck=luck; s.willpower=willpower; s.charisma=charisma;
        return s;
    }
}
