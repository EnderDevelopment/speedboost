package com.example.speedmod;

import net.fabricmc.api.ModInitializer;

public class SpeedmodMod implements ModInitializer {
    public static final String MOD_ID = "speedmod";

    @Override
    public void onInitialize() {
        ModEvents.init();
    }
}