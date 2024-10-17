package com.example.demo.Admin.Service;

import com.example.demo.Admin.Bean.Requestbean;
import com.example.demo.Admin.Bean.Responsebean;

public interface AdminService {
    Responsebean addAdmin (Requestbean requestbean,Responsebean responsebean);

    Responsebean bikeList();
}
