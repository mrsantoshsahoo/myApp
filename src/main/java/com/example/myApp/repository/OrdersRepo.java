package com.example.myApp.repository;
import com.example.myApp.models.OrdersData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface OrdersRepo extends MongoRepository<OrdersData, UUID> {
}
