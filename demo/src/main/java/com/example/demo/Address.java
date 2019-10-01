package com.example.demo;

import javax.persistence.Column;

public class Address {
    @Column(name = "City")
    private String city;

    @Column(name = "Street")
    private String street;

    @Column(name = "HouseNumber")
    private Integer housenumber;
}
