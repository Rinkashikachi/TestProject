package com.rinkashikachi.testmod.proxy;

import com.rinkashikachi.testmod.items.utility.ItemsRegister;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ItemsRegister.register();
    }

    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {}
}
