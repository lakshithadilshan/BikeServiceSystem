package com.example.demo.Admin.Controller;

import com.example.demo.Admin.Bean.Requestbean;
import com.example.demo.Admin.Bean.Responsebean;
import com.example.demo.Admin.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="adminregister")
public class AdminRegisterController {

    @Autowired
    Responsebean responsebean;
    @Autowired
    AdminService adminService;

    @PostMapping(value = "register")
    public Responsebean RegisterAdmin(@RequestBody Requestbean requestbean){

        responsebean = adminService.AdminRegister(requestbean,responsebean);
        return responsebean;
    }
}
