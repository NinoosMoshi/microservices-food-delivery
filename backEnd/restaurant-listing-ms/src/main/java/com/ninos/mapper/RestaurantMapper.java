package com.ninos.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ninos.model.dto.RestaurantDTO;
import com.ninos.model.entity.Restaurant;

@Service
public class RestaurantMapper {

    public RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant){
        RestaurantDTO restaurantDTO = new RestaurantDTO();
        BeanUtils.copyProperties(restaurant, restaurantDTO);
        return restaurantDTO;
    }


    public Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO){
        Restaurant restaurant = new Restaurant();
        BeanUtils.copyProperties(restaurantDTO, restaurant);
        return restaurant;
    }


}
