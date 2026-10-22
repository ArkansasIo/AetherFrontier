# Aether Frontier — Feature Tree

This is the canonical module/submodule tree for the planet-scale medieval-European + science-fiction strategy game.

## Root architecture

```text
AetherFrontier/
├── core/
│   ├── src/mindustry/           # Existing engine/game foundation
│   ├── src/aetherfrontier/       # New Aether Frontier systems
│   │   ├── world/
│   │   │   ├── planet/           # Planet map, continents, regions, provinces
│   │   │   ├── terrain/          # Terrain, elevation, rivers, coastlines
│   │   │   ├── biome/            # Forest, plains, desert, tundra, swamp, volcanic, alien
│   │   │   ├── settlement/       # Villages, towns, cities, capitals
│   │   │   ├── province/         # Borders, ownership, population, development
│   │   │   └── generation/       # Procedural map generation and seeds
│   │   ├── factions/
│   │   │   ├── races/            # Human, alien, fantasy and hybrid civilizations
│   │   │   ├── kingdoms/         # Medieval political structures
│   │   │   ├── empires/          # Large-scale sci-fi powers
│   │   │   └── diplomacy/        # Alliances, wars, treaties, reputation
│   │   ├── economy/
│   │   │   ├── resources/       # Ore, food, energy, crystal, materials
│   │   │   ├── production/       # Farms, mines, factories, reactors
│   │   │   ├── trade/            # Routes, markets, caravans, transports
│   │   │   └── taxation/         # Province income and treasury
│   │   ├── military/
│   │   │   ├── infantry/         # Medieval and futuristic ground units
│   │   │   ├── cavalry/          # Mounted and powered cavalry
│   │   │   ├── vehicles/         # Tanks, walkers, transports
│   │   │   ├── aircraft/         # Fighters, bombers, drones
│   │   │   ├── artillery/        # Siege and energy artillery
│   │   │   ├── defenses/         # Walls, towers, shields, turrets
│   │   │   └── commanders/       # Heroes, generals, officers
│   │   ├── buildings/
│   │   │   ├── medieval/         # Castles, keeps, churches, mills, farms
│   │   │   ├── industrial/       # Mines, factories, storage, logistics
│   │   │   ├── sci-fi/            # Reactors, shields, labs, launch systems
│   │   │   └── hybrid/            # Medieval-futuristic architecture
│   │   ├── research/
│   │   │   ├── medieval/         # Agriculture, metallurgy, masonry, navigation
│   │   │   ├── science/           # Physics, computing, energy, materials
│   │   │   ├── military/          # Weapons, armor, vehicles, defenses
│   │   │   └── space/             # Advanced planetary and orbital technology
│   │   ├── characters/
│   │   │   ├── classes/           # Warrior, engineer, mage-tech, scout, commander
│   │   │   ├── progression/       # Levels, skills, talents, attributes
│   │   │   ├── equipment/         # Weapons, armor, artifacts, implants
│   │   │   └── quests/            # Story, faction, regional and world quests
│   │   ├── campaign/
│   │   │   ├── maps/              # Named campaign maps
│   │   │   ├── missions/          # Objectives and scripted scenarios
│   │   │   ├── acts/              # Campaign progression
│   │   │   └── endgame/            # Planet-scale endgame state
│   │   ├── multiplayer/
│   │   │   ├── p2/                # 2-player rules/maps
│   │   │   ├── p3/                # 3-player rules/maps
│   │   │   ├── p4/                # 4-player rules/maps
│   │   │   ├── lobby/             # Match setup
│   │   │   └── persistence/       # Persistent world state
│   │   └── ui/
│   │       ├── planet-map/        # Strategic planet map UI
│   │       ├── command/           # RTS command interface
│   │       ├── economy/           # Resource/production panels
│   │       ├── military/          # Army/fleet panels
│   │       ├── diplomacy/         # Faction diplomacy screens
│   │       ├── research/          # Technology tree UI
│   │       └── endgame/           # Planet endgame dashboard
│   └── assets-raw/sprites/
│       ├── terrain/
│       ├── medieval/
│       ├── sci-fi/
│       ├── hybrid/
│       ├── units/
│       ├── buildings/
│       ├── effects/
│       ├── ui/
│       └── maps/
├── desktop/                       # Native desktop launcher/distribution
├── android/                       # Android client
├── ios/                            # iOS client
├── server/                         # Dedicated authoritative server
├── tools/                          # Asset/map/build tools
├── tests/                          # Unit/integration/system tests
└── docs/
    ├── design/
    ├── maps/
    ├── art/
    ├── gameplay/
    └── architecture/
```

## Asset rule

All new Aether Frontier art should use an original medieval-European + science-fiction visual language. Do not copy proprietary game sprites, logos, textures, maps, or character designs.

## Implementation rule

New systems should be data-driven where practical, isolated from the existing engine foundation, and designed so native desktop, mobile, dedicated-server, and future browser targets can share the same game rules.
