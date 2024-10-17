package com.example.demo.Admin.Repo;

import com.example.demo.Admin.Model.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String> {

}
