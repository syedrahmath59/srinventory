package com.inventory.store.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;

@RestController
@RequestMapping(value="/inventory")
public class InventoryController {

    @GetMapping(value = "/all")
    public ResponseEntity<String> getInventoryResponse(){
        String content = null;
        try{
            content = new String(Files.readAllBytes(ResourceUtils.getFile("classpath:data/api-response.json").toPath()));
        } catch (Exception e) {

        }
        return new ResponseEntity<String>(content, HttpStatus.OK);
    }

}
