package com.example.myApp.service;


import com.example.myApp.models.ComplaintModel;
import com.example.myApp.repository.ComplaintRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComplainService {
    @Autowired
    private ComplaintRepo complaintRepo;
    public List<ComplaintModel> getComplaints() {
        return complaintRepo.findAll();
    }

    public String postComplaints(ComplaintModel complaintModel) {
        complaintRepo.save(complaintModel);
        return  "Complain Post Sucessfully";
    }
}
