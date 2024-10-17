package com.example.demo.Admin.controller;

import com.example.demo.Admin.Bean.Requestbean;
import com.example.demo.Admin.Bean.Responsebean;
import com.example.demo.Admin.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/adminsc")
public class AdminRegisterController {

    @Autowired
    Responsebean responsebean;
    @Autowired
    AdminService adminService;

    @PostMapping(value = "/add")
    public Responsebean RegisterAdmin(@RequestBody Requestbean requestbean,Responsebean responsebean){

        responsebean = adminService.addAdmin(requestbean,responsebean);
        return responsebean;
    }

    @PostMapping(value = "/bikelist")
    public Responsebean BikeList(@RequestBody Requestbean requestbean,Responsebean responsebean){
        responsebean = adminService.bikeList();
        return responsebean;
    }
}
