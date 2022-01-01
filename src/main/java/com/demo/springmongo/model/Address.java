package com.demo.springmongo.model;

import lombok.Data;

@Data
public class Address {
    private String city;
    private String country;
    private String postCode;

    public Address(String city, String country, String postCode) {
        this.city = city;
        this.country = country;
        this.postCode = postCode;
    }
}
