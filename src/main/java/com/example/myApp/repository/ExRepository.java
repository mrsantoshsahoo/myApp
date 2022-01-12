package com.example.myApp.repository;
import com.example.myApp.models.ExModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExRepository extends MongoRepository<ExModel, UUID> {
}
