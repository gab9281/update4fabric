package com.gab9281.update4fabric.base_classes;

import com.mojang.brigadier.context.CommandContext;

import net.minecraft.entity.player.PlayerEntity;
import net.fabricmc.fabric.api.client.command.v1.FabricClientCommandSource;

public abstract class BaseCommand {
    static protected PlayerEntity player = null;

    public void Register(String environment) {
        if (environment.equals("CLIENT")) {
            registerClient();
        } else {
            registerServer();
        }
    }

    public PlayerEntity getPlayer(CommandContext ctx) {
        return ((FabricClientCommandSource) ctx.getSource()).getPlayer();
    }

    public abstract void registerClient();

    protected abstract int runClient(CommandContext ctx);

    public abstract void registerServer();

    protected abstract int runServer(CommandContext ctx);
}
