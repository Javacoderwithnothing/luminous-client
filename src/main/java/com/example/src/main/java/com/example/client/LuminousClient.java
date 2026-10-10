
package com.example.client;

import net.fabricmc.api.ClientModInitializer;

public class LuminousClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Luminous Client initialized!");
    }
}

