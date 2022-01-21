package com.gab9281.update4fabric.provider;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

import com.gab9281.update4fabric.base_classes.Provider;
import com.gab9281.update4fabric.Exceptions.ModNotFoundException;
import com.gab9281.update4fabric.base_classes.Mod;

public class Modrinth extends Provider {

    private String endpoint = "https://modrinth.com";

    public Modrinth() {
        super();
    }

    @Override
    public Mod getModInfosByModId(String modId) throws ModNotFoundException {
        /*
         * try {
         * HttpResponse<Object> data = httpclient.send(
         * HttpRequest.newBuilder().GET().uri(URI.create(endpoint + "/project/" +
         * modId)).build(),
         * null);
         * System.out.println("Mod Info : " + data.toString());
         * } catch (Exception e) {
         * throw new
         * ModNotFoundException("The mod can't be found in this provider or provider is unavailable"
         * );
         * }
         */
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
