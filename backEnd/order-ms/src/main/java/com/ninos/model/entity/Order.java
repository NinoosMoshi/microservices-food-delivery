package com.ninos.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ninos.model.dto.FoodItemDTO;
import com.ninos.model.dto.Restaurant;
import com.ninos.model.dto.UserDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

    private Long orderId;
    private List<FoodItemDTO> foodItemList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
