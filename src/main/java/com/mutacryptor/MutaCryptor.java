package com.mutacryptor;



public class MutaCryptor {

    // Mock encryption method
    public String encrypt(String data) {
        return "encrypted_" + data;
    }

    // Mock decryption method
    public String decrypt(String encryptedData) {
        return encryptedData.replace("encrypted_", "");
    }
}
