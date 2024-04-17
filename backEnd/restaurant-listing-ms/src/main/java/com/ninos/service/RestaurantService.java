package com.ninos.service;

import java.util.List;

import com.ninos.model.dto.RestaurantDTO;

public interface RestaurantService {

    List<RestaurantDTO> findAllRestaurants();

    RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO);
    
    RestaurantDTO fetchRestaurantById(Long id);

}
