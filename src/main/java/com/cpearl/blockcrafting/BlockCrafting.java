package com.cpearl.blockcrafting;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(BlockCrafting.MODID)
public class BlockCrafting
{
    public static final String MODID = "blockcrafting";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BlockCrafting() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BlockCraftingConfig.CONFIG);
    }
}
