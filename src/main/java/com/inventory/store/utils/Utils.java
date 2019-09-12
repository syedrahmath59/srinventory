package com.inventory.store.utils;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.nio.file.Files;

public class Utils {

    public static void main(String[] args) {

        String content = null;
        try{
            File file = ResourceUtils.getFile("classpath:data/api-response.json");
            System.out.println("file exists : "+file.exists());
            content = new String(Files.readAllBytes(ResourceUtils.getFile("classpath:data/api-response.json").toPath()));
            System.out.println(" json : "+content);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
