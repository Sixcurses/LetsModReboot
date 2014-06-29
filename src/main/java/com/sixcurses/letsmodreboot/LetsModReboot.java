package com.sixcurses.letsmodreboot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "LetsModReboot", name = "Let's Mod Reboot", version = "1.7.2-1.0")
public class LetsModReboot {

    @Mod.Instance("LetsModReboot")
    public static LetsModReboot instance;

    @Mod.EventHandler // Networkhandling, Config, Items / Blocks
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler // Gui, Tile Entity's, Recipes, General
    public void init (FMLInitializationEvent event){

    }

    @Mod.EventHandler // Wrap up
    public void postInit (FMLPostInitializationEvent event){

    }
}
