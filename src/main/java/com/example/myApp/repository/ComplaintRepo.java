package com.example.myApp.repository;

import com.example.myApp.models.ComplaintModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ComplaintRepo extends MongoRepository<ComplaintModel, UUID> {
}
