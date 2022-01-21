package com.gab9281.update4fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import com.gab9281.update4fabric.commands.CheckUpdate;
import com.gab9281.update4fabric.commands.Infos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("update4fabric");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Getting ready to update some mods !");
		loadCommands(FabricLoader.getInstance().getEnvironmentType().name());
	}

	public void loadCommands(String environment) {
		new CheckUpdate().Register(environment);
		new Infos().Register(environment);
	}
}
