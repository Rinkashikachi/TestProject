package com.rinkashikachi.testmod.proxy;

import com.rinkashikachi.testmod.items.utility.ItemsRegister;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) { super.preInit(event); }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        ItemsRegister.registerRender();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) { super.postInit(event); }
}
