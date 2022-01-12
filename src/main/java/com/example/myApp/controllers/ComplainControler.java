package com.example.myApp.controllers;
import com.example.myApp.models.ComplaintModel;
import com.example.myApp.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complains")
public class ComplainControler {
    @Autowired
    private ComplainService complainService;

    @GetMapping("")
    public List<ComplaintModel> getComplaints(){
        return complainService.getComplaints();
    }
    @PostMapping("")
    public String postComplaints(@RequestBody ComplaintModel complaintModel){
        return complainService.postComplaints(complaintModel);
    }
}
