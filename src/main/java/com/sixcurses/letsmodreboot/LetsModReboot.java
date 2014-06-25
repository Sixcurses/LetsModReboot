package com.sixcurses.letsmodreboot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "LetsModReboot", name = "Let's Mod Reboot", version = "1.7.2-1.0")
public class LetsModReboot {
    @Mod.Instance("LetsModReboot")
    public static LetsModReboot instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){ // Network Modconfig Blocks Items

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){ // Gui Tile Entity's Crafting Recipe's general

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){ // Wrap Things up

    }
}
