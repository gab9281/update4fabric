package com.gab9281.update4fabric.commands;

import com.gab9281.update4fabric.base_classes.BaseCommand;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

import net.fabricmc.fabric.api.client.command.v1.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v1.FabricClientCommandSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class Infos extends BaseCommand {

    @Override
    public void registerServer() {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerClient() {
        ClientCommandManager.DISPATCHER
                .register(LiteralArgumentBuilder.<FabricClientCommandSource>literal("Update4Fabric")
                        .then(LiteralArgumentBuilder.<FabricClientCommandSource>literal("Infos").executes(ctx -> {
                            return run(ctx);
                        })));
    }

    @Override
    public int run(CommandContext ctx) {
        PlayerEntity player = getPlayer(ctx);
        player.sendMessage(
                Text.Serializer.fromJson("{\"text\":\"Hello little one !\",\"color\":\"light_purple\"}"),
                true);
        return 1;
    }

}
