package com.gab9281.update4fabric.provider;

import java.nio.file.Path;

import com.gab9281.update4fabric.base_classes.Provider;
import com.gab9281.update4fabric.base_classes.Mod;

public class Modrinth extends Provider {

    private String endpoint = "https://modrinth.com";

    public Modrinth() {
        super();
    }

    @Override
    public Mod getModInfosByModId(String modId) {
        return null;
    }

    @Override
    public Mod getModInfosByHash(String hash) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isThereAnUpdate(Mod mod) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Path downloadMod(Mod mod) {
        // TODO Auto-generated method stub
        return null;
    }

}
