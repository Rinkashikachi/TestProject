package com.rinkashikachi.testmod.items.utility;

import com.rinkashikachi.testmod.items.TestItem;

import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.Objects;

public class ItemsRegister {
    public static Item TEST_ITEM = new TestItem("testitem");

    public static void register() {
        setRegister(TEST_ITEM);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(TEST_ITEM);
    }

    private static void setRegister(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}
