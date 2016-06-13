package com.ewyboy.ore.proxy;

import com.ewyboy.ore.ORE;
import com.ewyboy.ore.common.config.Config;

import java.io.File;

/** Created by EwyBoy **/
public abstract class CommonProxy implements IProxy {


    @Override
    public void registerWorldGen() {

    }

    @Override
    public void registerConfiguration(File configFile) {
        ORE.configuration = Config.initConfig(configFile);
    }

    @Override
    public void registerEvents() {
        //WorldGenInit.init();
    }
}
