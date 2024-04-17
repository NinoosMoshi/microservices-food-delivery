package com.ninos.service;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ninos.mapper.FoodItemMapper;
import com.ninos.model.dto.FoodCataloguePage;
import com.ninos.model.dto.FoodItemDTO;
import com.ninos.model.dto.Restaurant;
import com.ninos.model.entity.FoodItem;
import com.ninos.repository.FoodItemRepo;

@AllArgsConstructor
@Service
public class FoodCatalogueServiceImpl implements FoodCatalogueService{

    private final FoodItemRepo foodItemRepo;
    private final FoodItemMapper foodItemMapper;
    private final RestTemplate restTemplate;


    @Override
    public FoodItemDTO addFoodItem(FoodItemDTO foodItemDTO) {
        FoodItem foodItem = foodItemMapper.mapFoodItemDTOToFoodItem(foodItemDTO);
        FoodItem FoodItemInDB = foodItemRepo.save(foodItem);
        return foodItemMapper.mapFoodItemToFoodItemDto(FoodItemInDB);
    }


    @Override
    public FoodCataloguePage fetchFoodCataloguePageDetails(Long restaurantId) {
        List<FoodItem> foodItemList = fetchFoodItemList(restaurantId);
        Restaurant restaurant = fetchRestaurantDetailsFromRestaurantMS(restaurantId);
        return createFoodCataloguePage(foodItemList, restaurant);
    }


    private FoodCataloguePage createFoodCataloguePage(List<FoodItem> foodItemList, Restaurant restaurant) {
        FoodCataloguePage foodCataloguePage = new FoodCataloguePage();
        foodCataloguePage.setFoodItemsList(foodItemList);
        foodCataloguePage.setRestaurant(restaurant);
        return foodCataloguePage;
    }

    private Restaurant fetchRestaurantDetailsFromRestaurantMS(Long restaurantId) {
        return restTemplate.getForObject("http://RESTAURANT-SERVICE/api/v1/restaurant/fetchById/"+restaurantId, Restaurant.class);
    }


    private List<FoodItem> fetchFoodItemList(Long restaurantId) {
        return foodItemRepo.findByRestaurantId(restaurantId);
    }


}
