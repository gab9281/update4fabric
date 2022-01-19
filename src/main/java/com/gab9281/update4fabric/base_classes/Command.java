package com.gab9281.update4fabric.base_classes;

public abstract class Command {
    public void Register(String environment) {
        if (environment.equals("CLIENT")) {
            registerClient();
        } else {
            registerServer();
        }
    }

    public abstract void registerServer();

    public abstract void registerClient();

    public abstract void run();
}
