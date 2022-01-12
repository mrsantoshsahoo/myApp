package com.example.myApp.controllers;

import com.example.myApp.models.ExModel;
import com.example.myApp.service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/exModel")
public class ExControler {
    @Autowired
    private ExService exService;

    @GetMapping("")
    public List<ExModel> getExData() {
        return exService.getExData();
    }

    @GetMapping("/otp")
    public String getOtp() {
        return exService.getOtp();
    }

    @GetMapping("/mail/{mail}")
    public String getMail(@PathVariable String mail) {
        return exService.getMail(mail);
    }

    @GetMapping("/validateOtp")
    public String validateMetMail() {
        return exService.validateMetMail();
    }

    @GetMapping("/pajiation")
    public Page<ExModel>
    getDemoListPagination(@RequestParam(required = false, defaultValue = "0") int pageSize, @RequestParam(required = false, defaultValue = "10") int pageNo) {
        return exService.getDemoListPagination(pageSize, pageNo);
    }

    @PostMapping("")
    public List<ExModel> postExData(@RequestBody ExModel exModel) {
        return exService.postExData(exModel);
    }

    @GetMapping("/{exId}")
    public Optional<ExModel> updateData(@PathVariable UUID exId) {
        return exService.updateData(exId);
    }
}
