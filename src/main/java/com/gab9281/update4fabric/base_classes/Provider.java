package com.gab9281.update4fabric.base_classes;

import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.nio.file.Path;
import java.time.Duration;

import com.gab9281.update4fabric.Exceptions.ModNotFoundException;

public abstract class Provider {

    static protected HttpClient httpclient;

    public Provider() {
        httpclient = HttpClient.newBuilder().version(Version.HTTP_2).followRedirects(Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(5)).build();
    }

    public abstract Mod getModInfosByModId(String modId) throws ModNotFoundException;

    public abstract Mod getModInfosByHash(String hash);

    public abstract boolean isThereAnUpdate(Mod mod);

    public abstract Path downloadMod(Mod mod);
}
