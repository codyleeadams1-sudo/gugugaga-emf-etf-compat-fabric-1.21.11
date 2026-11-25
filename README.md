# Gugugaga EMF/ETF Compatibility (Fabric 1.21.11)

Optional companion mod for **Gugugaga Remastered**.

## Requirements
- Minecraft Java 1.21.11
- Java 21
- Fabric Loader and Fabric API
- Gugugaga Remastered (mod id: `gugugaga`)
- Optional client-side mods: Entity Model Features (EMF) and Entity Texture Features (ETF), matching Minecraft 1.21.11

## What this companion currently does
- Requires the main `gugugaga` mod, so it cannot be installed by itself.
- Declares EMF and ETF as optional suggestions rather than hard dependencies.
- Detects whether EMF and ETF are installed and reports that in the log.

## Important limitation
This is a compatibility bootstrap, **not an EMF/ETF model adapter**. EMF/ETF do not automatically make an arbitrary Fabric entity renderer use Bedrock geometry/animation JSON. The main mod's renderer must be specifically implemented for the relevant model format/API before EMF/ETF can affect Gugu Gaga's appearance. This companion deliberately does not claim to fix model UVs, animations, or rendering by itself.

## Build
Run `gradle build` with Java 21. The JAR is written to `build/libs/`.
