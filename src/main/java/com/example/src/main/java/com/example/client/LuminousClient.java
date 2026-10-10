
package com.example.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.Minecraft;

public class LuminousClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("Luminous Client UI initialized!");
    }
}
