package com.example.service;

import com.example.model.DataModel;
import com.example.repository.DataRepository;
import com.mutacryptor.MutaCryptor; // Ensure correct import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class EncryptionService {

    private final MutaCryptor mutaCryptor = new MutaCryptor(); // Initialize MutaCryptor

    @Autowired
    private DataRepository dataRepository;

    // Async encryption method
    @Async
    public CompletableFuture<String> encryptDataAsync(String data) {
        String encryptedData = mutaCryptor.encrypt(data);

        // Save encrypted data to the database
        dataRepository.save(new DataModel(encryptedData));
        return CompletableFuture.completedFuture(encryptedData);
    }

    // Synchronous decryption method
    public String decryptData(String encryptedData) {
        return mutaCryptor.decrypt(encryptedData);
    }
}
