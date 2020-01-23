package com.rinkashikachi.testmod.items;

import net.minecraft.item.Item;

public class TestItem extends Item {

    public TestItem(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
