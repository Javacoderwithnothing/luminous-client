
package com.example.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ExampleModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Luminous Client initialized!");
    }
}
