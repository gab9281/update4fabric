package com.gab9281.update4fabric.commands;

import com.gab9281.update4fabric.Main;
import com.gab9281.update4fabric.base_classes.BaseCommand;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

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
    public int run(CommandContext<Object> context) throws CommandSyntaxException {
        // TODO Auto-generated method stub
        return 0;
    }

}
