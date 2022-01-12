package com.example.myApp.controllers;
import com.example.myApp.models.OrdersData;
import com.example.myApp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersControler {
    @Autowired
    private OrderService orderService;

    @GetMapping("")
    public List<OrdersData> getComplaints(){
        return orderService.getOrdersList();
    }
    @PostMapping("")
    public String postComplaints(@RequestBody OrdersData complaintModel){
        return orderService.postOrders(complaintModel);
    }
}
