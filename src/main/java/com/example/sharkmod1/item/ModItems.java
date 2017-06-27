package com.example.sharkmod1.item;

import com.example.sharkmod1.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by david on 6/26/17.
 */
public final class ModItems {

    public  static Item plumbus;

    public static void init() {
        plumbus = new Item().setUnlocalizedName("plumbus").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":plumbus");
        GameRegistry.registerItem(plumbus, "plumbus");


    }
}
