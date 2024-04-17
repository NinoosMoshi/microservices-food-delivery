package com.ninos.model.dto;

import lombok.Data;
import java.util.List;

@Data
public class OrderDTOFromFE {

    private List<FoodItemDTO> foodItemsList;
    private Long userId;
    private Restaurant restaurant;

}
