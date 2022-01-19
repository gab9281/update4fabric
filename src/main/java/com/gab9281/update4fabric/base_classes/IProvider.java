package com.gab9281.update4fabric.base_classes;

import java.nio.file.Path;

public interface IProvider {
    public Mod getModInfosByModId(String modId);

    public Mod getModInfosByHash(String hash);

    public Path downloadMod(String modId);
}
