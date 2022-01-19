package com.gab9281.update4fabric;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PreLaunch implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        Main.LOGGER.info("Looking for mods to move");
    }
}