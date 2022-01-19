package com.gab9281.update4fabric.commands;

import com.gab9281.update4fabric.Main;
import com.gab9281.update4fabric.base_classes.Command;

public class CheckUpdate extends Command {

    @Override
    public void registerServer() {
        Main.LOGGER.info("Registering with Server");
    }

    @Override
    public void registerClient() {
        Main.LOGGER.info("Registering with Client");
    }

    @Override
    public void run() {

    }

}
