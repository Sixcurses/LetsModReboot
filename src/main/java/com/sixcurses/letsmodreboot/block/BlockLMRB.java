package com.sixcurses.letsmodreboot.block;

import com.sixcurses.letsmodreboot.creativetab.CreativeTabLMRB;
import com.sixcurses.letsmodreboot.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockLMRB extends Block {

    public BlockLMRB (Material material){
        super(material);
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }
    public BlockLMRB(){
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    protected String getUnwrappedUnlocalizedName (String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") +1);
    }
}
