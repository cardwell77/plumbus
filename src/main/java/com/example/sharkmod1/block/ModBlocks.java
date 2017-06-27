package com.example.sharkmod1.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by david on 6/26/17.
 */
public final class ModBlocks {

    public static Block plumbusBlock;

    public static final void init() {
        GameRegistry.registerBlock(plumbusBlock = new BasicBlock("plumbusBlock", Material.iron), "plumbusBlock");

    }
}
