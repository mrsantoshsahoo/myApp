package com.example.myApp.repository;
import com.example.myApp.models.Ecom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface MailOto  extends MongoRepository<Ecom, UUID> {
}
