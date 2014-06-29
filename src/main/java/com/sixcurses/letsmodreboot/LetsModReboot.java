package com.sixcurses.letsmodreboot;

import com.sixcurses.letsmodreboot.proxy.IProxy;
import com.sixcurses.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy (clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

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
