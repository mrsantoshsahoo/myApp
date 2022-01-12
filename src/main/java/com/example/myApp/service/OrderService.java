package com.example.myApp.service;

import com.example.myApp.models.OrdersData;
import com.example.myApp.repository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrdersRepo ordersRepo;
    public List<OrdersData> getOrdersList() {
        return  ordersRepo.findAll();
    }

    public String postOrders(OrdersData complaintModel) {
        ordersRepo.save(complaintModel);
        return "Create Order Complain Sucessfully";
    }
}
