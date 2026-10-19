package com.garfield;

import net.fabricmc.api.ClientModInitializer;

public class GarfieldClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Garfield visual mod loaded!");
    }
}
