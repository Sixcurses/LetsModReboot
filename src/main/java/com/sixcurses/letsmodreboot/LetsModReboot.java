package com.sixcurses.letsmodreboot;

import com.sixcurses.letsmodreboot.handler.ConfigurationHandler;
import com.sixcurses.letsmodreboot.init.ModItems;
import com.sixcurses.letsmodreboot.init.ModBlocks;
import com.sixcurses.letsmodreboot.proxy.IProxy;
        import com.sixcurses.letsmodreboot.reference.Reference;
        import com.sixcurses.letsmodreboot.utility.LogHelper;
        import cpw.mods.fml.common.FMLCommonHandler;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.SidedProxy;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy (clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler // PREINIT Networkhandling, Config, Items / Blocks
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info ("Pre Initialization Complete!");

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler // INIT Gui, Tile Entity's, Recipes, General
    public void init (FMLInitializationEvent event){
        LogHelper.info ("Initialization Complete!");
    }

    @Mod.EventHandler // POSTINIT Wrap up
    public void postInit (FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization Complete!");
    }
}
