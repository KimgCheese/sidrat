package com.ajstpn.sidrat.item;

import com.ajstpn.sidrat.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup SIDRAT_GROUP = new ItemGroup("sidratgroup")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.TARDISCORE.get());
        }
    };
}
