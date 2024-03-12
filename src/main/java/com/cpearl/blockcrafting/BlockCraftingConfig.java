package com.cpearl.blockcrafting;

import net.minecraftforge.common.ForgeConfigSpec;

public class BlockCraftingConfig {

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec CONFIG;

    public static final General GENERAL = new General(BUILDER);

    static {
        CONFIG = BUILDER.build();
    }

    public static class General
    {

        public final ForgeConfigSpec.BooleanValue enableGTBuildMode;
        public General(ForgeConfigSpec.Builder builder) {
            builder.push("Common");

            enableGTBuildMode = builder
                    .comment("Whether to enable gt build mode.")
                    .define("enableGTBuildMode", true);

            builder.pop();
        }
    }
}
