package com.gugugaga.compat;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Optional compatibility companion. EMF/ETF are detected without linking against
 * their internal APIs, so this mod remains loadable when either optional mod is absent.
 * Actual custom-entity model support still has to be implemented by the main mod's renderer.
 */
public final class GuguCompat implements ModInitializer {
    public static final String MOD_ID = "gugugaga_emf_etf_compat";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        FabricLoader loader = FabricLoader.getInstance();
        boolean emf = loader.isModLoaded("entity_model_features");
        boolean etf = loader.isModLoaded("entity_texture_features");

        LOGGER.info("Gugugaga compatibility companion loaded.");
        LOGGER.info("EMF detected: {}; ETF detected: {}", emf, etf);
        if (!emf || !etf) {
            LOGGER.info("For the intended optional feature setup, install both Entity Model Features (EMF) and Entity Texture Features (ETF) for Minecraft 1.21.11.");
        }
        LOGGER.warn("This companion only detects and declares optional EMF/ETF compatibility. It does not convert or replace the Gugu Gaga entity renderer; the main mod must provide a compatible model implementation.");
    }
}
