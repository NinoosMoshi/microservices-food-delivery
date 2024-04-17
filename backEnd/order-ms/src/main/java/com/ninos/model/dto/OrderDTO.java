package com.ninos.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {

    private Long orderId;
    private List<FoodItemDTO> foodItemList;
    private Restaurant restaurant;
    private UserDTO userDTO;


}
