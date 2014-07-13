package com.sixcurses.letsmodreboot.init;

import com.sixcurses.letsmodreboot.block.BlockFlag;
import com.sixcurses.letsmodreboot.block.BlockLMRB;
import com.sixcurses.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMRB flag = new BlockFlag();

    public static void init (){
        GameRegistry.registerBlock(flag, "flag");
    }
}
