package com.example.speedmod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.ai.attributes.Attributes;

public final class ModEvents {
    private ModEvents() {
    }

    public static void init() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {
                if (player.isSprinting()) {
                    player.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.3);
                } else {
                    player.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
                }
            }
        });
    }
}