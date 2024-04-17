package com.ninos.model.dto;

import lombok.Data;

@Data
public class Restaurant {

    private Long id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;

}
