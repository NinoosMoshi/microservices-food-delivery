package com.ninos.model.dto;

import lombok.Data;

@Data
public class FoodItemDTO {

    private Long id;
    private String itemName;
    private String itemDescription;
    private boolean isVeg;
    private Long price;
    private Long restaurantId;
    private Integer quantity;

}
