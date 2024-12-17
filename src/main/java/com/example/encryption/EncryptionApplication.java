package com.example.encryption;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication  
@EnableAsync  
public class EncryptionApplication {
    
    public static void main(String[] args) {
       
        SpringApplication.run(EncryptionApplication.class, args);
    }
}
