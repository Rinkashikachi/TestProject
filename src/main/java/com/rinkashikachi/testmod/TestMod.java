package com.rinkashikachi.testmod;

import com.rinkashikachi.testmod.utility.Constants;
import com.rinkashikachi.testmod.proxy.CommonProxy;
import org.apache.logging.log4j.Logger;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.NAME, version = Constants.VERSION,
        acceptedMinecraftVersions = Constants.ACCEPTED_VERSIONS)
public class TestMod {

    private static Logger logger;

    @SidedProxy(clientSide = Constants.PROXY_CLIENT,
            serverSide = Constants.SERVER_CLIENT)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
