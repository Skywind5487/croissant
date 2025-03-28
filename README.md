# Croissant Mod

A simple Minecraft mod that adds croissants and related items to the game.

## Features

- Adds croissant as a new food item
- Custom music disc
- New creative inventory tab "las Croissants"
- Integration with Hero of the Village gameplay mechanic (farmer gifts) and more looting tables

## Requirements

- Minecraft 1.19.3
- Fabric Loader >=0.14.19
- Fabric API
- Java 17 or higher

## Development

This project uses Gradle for build automation and dependency management.

### Setup

1. Clone the repository
2. Import the project into your IDE
3. Run the following commands:
   ```bash
   ./gradlew build
    ```
   
### development
1. Setup
2. Run the following commands:
   ```bash
   ./gradlew genSources
    ```
3. Copy the mod from addToModFolder to the mods folder in the run/mods folder
   1. Include tweakroo and iris
4. Copy the intro_World2.0 to the run/saves folder
4. Run the following commands if you want to test the mod:
   ```bash
   ./gradlew runClient
    ```