package com.example.model;





import jakarta.persistence.*;
@Entity
@Table(name = "encrypted_data")
public class DataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "encrypted_value", nullable = false)  // Renamed to reflect the correct field name
    private String encryptedValue;

    // Default Constructor
    public DataModel() {
    }

    // Constructor to save encrypted value
    public DataModel(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEncryptedValue() {
        return encryptedValue;
    }

    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }
}
