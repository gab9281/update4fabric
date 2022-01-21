package com.gab9281.update4fabric.commands;

import com.gab9281.update4fabric.Main;
import com.gab9281.update4fabric.base_classes.BaseCommand;
import com.mojang.brigadier.context.CommandContext;

public class CheckUpdate extends BaseCommand {

    @Override
    public void registerServer() {
        Main.LOGGER.info("Registering with Server");
    }

    @Override
    public void registerClient() {
        Main.LOGGER.info("Registering with Client");
    }

    @Override
    protected int runClient(CommandContext ctx) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected int runServer(CommandContext ctx) {
        // TODO Auto-generated method stub
        return 0;
    }

}
