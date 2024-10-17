package com.example.demo.Admin.Model.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BikeId")
    private Integer bikeId;

    @Column(name = "BikeModel")
    private String bikeModel;

    @Column(name = "BikeManufacturer")
    private String bikeManufacturer;

    @Column(name = "ManufactureYear")
    private String manufactureYear;

    @Column(name = "Milage")
    private Long milage;

    @Column(name = "ManufacturerCountry")
    private String manufacturerCountry;
}
