# Aether Frontier

![Aether Frontier Logo](core/assets-raw/sprites/ui/logo.png)

**Aether Frontier** is a cross-platform strategy and simulation game project built on an existing GPL-licensed game-engine foundation and expanded into a new universe of exploration, colonies, factions, fleets, combat, progression, and persistent-world systems.

## Project Direction

Aether Frontier is being developed toward a combined 4X strategy, real-time strategy, RPG progression, persistent multiplayer/MMORPG, and procedural galaxy experience.

## Building

The project retains its Gradle-based build structure.

### Windows

```text
gradlew desktop:run
gradlew desktop:dist
gradlew tools:pack
```

### Linux / macOS

```text
./gradlew desktop:run
./gradlew desktop:dist
./gradlew tools:pack
```

### Server

```text
gradlew server:dist
```

### Android

```text
gradlew android:assembleDebug
```

JDK and Android SDK requirements should be checked against the project's current Gradle configuration before building.

## Development

The long-term architecture separates the reusable runtime foundation from Aether Frontier game systems, including:

- Galaxy and star systems
- Planets, moons, stations, and sectors
- Factions and races
- Colonies and buildings
- Resources and economy
- Research and technology
- Fleets and units
- Characters and commanders
- Inventory and equipment
- Abilities and progression
- Quests and missions
- Diplomacy
- Procedural world generation
- Persistent multiplayer state

## Licensing

Aether Frontier contains original contributions as well as modified and/or derived third-party GPL-licensed material.

The applicable GNU General Public License, version 3, is retained in `LICENSE`. The Aether Frontier project-specific licensing statement is in `LICENSE-AETHERFRONTIER`. Additional notices and attribution information are in `NOTICE.md`.

Original Aether Frontier contributions remain subject to the license stated for those contributions. Third-party copyright and license notices remain applicable to the corresponding portions of the source tree.

## Attribution

Aether Frontier is a modified and expanded project. Rebranding the project and its user-facing presentation does not remove the copyright or license rights associated with third-party components. Required legal notices are retained where applicable.

## Project Status

This repository is under active redesign. Game systems, assets, APIs, server architecture, and platform packaging may change as Aether Frontier evolves.
