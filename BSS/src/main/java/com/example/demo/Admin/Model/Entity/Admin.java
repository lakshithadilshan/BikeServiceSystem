package com.example.demo.Admin.Model.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "Admin")
@Getter
@Setter
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AdminId")
    private Integer adminId;

    @NotNull
    @Column(name = "AdminName" )
    private String adminName;

    @NotNull
    @Column(name = "AdminPassword")
    private  String password;
}
