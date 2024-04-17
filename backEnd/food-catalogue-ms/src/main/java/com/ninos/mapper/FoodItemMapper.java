package com.ninos.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ninos.model.dto.FoodItemDTO;
import com.ninos.model.entity.FoodItem;

@Service
public class FoodItemMapper {

    public FoodItemDTO mapFoodItemToFoodItemDto(FoodItem foodItem){
        FoodItemDTO foodItemDTO = new FoodItemDTO();
        BeanUtils.copyProperties(foodItem, foodItemDTO);
        return foodItemDTO;
    }


    public FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO){
        FoodItem foodItem = new FoodItem();
        BeanUtils.copyProperties(foodItemDTO, foodItem);
        return foodItem;
    }


}
