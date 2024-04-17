package com.ninos.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantDTO {

    private Long id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;


}
