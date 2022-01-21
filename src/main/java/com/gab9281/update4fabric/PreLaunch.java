package com.gab9281.update4fabric;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class PreLaunch implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        Main.LOGGER.info("Looking for mods to move");
    }
}