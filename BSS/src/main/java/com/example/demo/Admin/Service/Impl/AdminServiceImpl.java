package com.example.demo.Admin.Service.Impl;

import com.example.demo.Admin.Bean.AdminBean;
import com.example.demo.Admin.Bean.Requestbean;
import com.example.demo.Admin.Bean.Responsebean;
import com.example.demo.Admin.Model.Entity.Admin;
import com.example.demo.Admin.Repo.AdminRepository;
import com.example.demo.Admin.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Responsebean addAdmin(Requestbean requestbean, Responsebean responsebean) {

        AdminBean adminBean = modelMapper.map(requestbean.getRequestBody(),AdminBean.class);
        Admin admin = new Admin();
        admin.setAdminName(adminBean.getAdminName());
        admin.setPassword(adminBean.getPassword());
        adminRepository.saveAndFlush(admin);
        responsebean.setResponseCode("00");
        responsebean.setResponseMsg("Success");
        responsebean.setContent(null);
        return responsebean;
    }

    @Override
    public Responsebean bikeList() {

        return null;
    }
}
