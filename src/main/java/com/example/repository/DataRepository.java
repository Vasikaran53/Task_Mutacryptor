package com.example.repository;



import com.example.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DataRepository extends JpaRepository<DataModel, Long> {
    
    // Find data by exact match of encrypted value
    Optional<DataModel> findByEncryptedValue(String encryptedValue);
    
    // Find all data that contains a specific keyword (partial match) in encrypted value
    List<DataModel> findByEncryptedValueContaining(String keyword);
    
    // Count how many records contain a specific keyword in encrypted value
    long countByEncryptedValueContaining(String keyword);
    
    // Delete records where encrypted value matches the input
    void deleteByEncryptedValue(String encryptedValue);
    
    // Find all data entries, ordered by ID in descending order
    List<DataModel> findAllByOrderByIdDesc();
}
