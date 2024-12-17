package com.example.controller;


import com.example.service.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/encryption")
public class EncryptionController {

    @Autowired
    private EncryptionService encryptionService;

    // Endpoint for asynchronous encryption
    @PostMapping("/encrypt")
    public CompletableFuture<String> encryptData(@RequestBody String data) {
        return encryptionService.encryptDataAsync(data);
    }

    // Endpoint for synchronous decryption
    @PostMapping("/decrypt")
    public String decryptData(@RequestBody String encryptedData) {
        return encryptionService.decryptData(encryptedData);
    }
}
