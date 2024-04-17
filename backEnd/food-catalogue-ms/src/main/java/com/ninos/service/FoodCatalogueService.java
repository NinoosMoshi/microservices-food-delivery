package com.ninos.service;

import com.ninos.model.dto.FoodCataloguePage;
import com.ninos.model.dto.FoodItemDTO;

public interface FoodCatalogueService {

    FoodItemDTO addFoodItem(FoodItemDTO foodItemDTO);

    FoodCataloguePage fetchFoodCataloguePageDetails(Long restaurantId);


}
