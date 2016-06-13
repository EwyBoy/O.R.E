package com.ewyboy.ore.common.world;

import com.ewyboy.ore.common.config.ConfigWorldGen;
import com.ewyboy.ore.common.enums.EnumVanillaWorldGen;

public class WorldGenInit {

    public static void init() {
        for (EnumVanillaWorldGen ore : EnumVanillaWorldGen.values()) {
            ConfigWorldGen.OreConfig config = ConfigWorldGen.OreWorldGen.get(ore);
         /*   WorldGen.addOreGen(ore.name().toLowerCase(), null *//**Blocks here*//* .getStateFromMeta(ore.getMeta()), config);*/
        }
    }
}