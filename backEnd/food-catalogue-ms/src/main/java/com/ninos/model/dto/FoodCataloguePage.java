package com.ninos.model.dto;

import lombok.Data;

import java.util.List;

import com.ninos.model.entity.FoodItem;

@Data
public class FoodCataloguePage {

    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;

}
