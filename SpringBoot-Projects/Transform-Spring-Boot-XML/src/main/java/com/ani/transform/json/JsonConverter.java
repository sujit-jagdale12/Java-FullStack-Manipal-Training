package com.ani.transform.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Component
public class JsonConverter{

    private final JsonParser parser = JsonParserFactory.getJsonParser();
    // private final Gson gson = new Gson();
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();   // IN proper json format
    
    public Config toDomain(String path) throws IOException {

        System.out.println(path);
        byte[] data = Files.readAllBytes(Paths.get(path));
        String json = new String(data);
        System.out.println(json);

        // Map<String, Object> map = parser.parseMap(new String(data));

       return gson.fromJson(json, Config.class);
    }

    public String toJson(Config cfg) {
        return gson.toJson(cfg);
    }
}
