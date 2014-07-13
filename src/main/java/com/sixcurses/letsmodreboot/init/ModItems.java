package com.sixcurses.letsmodreboot.init;

import com.sixcurses.letsmodreboot.item.ItemLMRB;
import com.sixcurses.letsmodreboot.item.ItemMapleLeaf;
import com.sixcurses.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init(){
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
