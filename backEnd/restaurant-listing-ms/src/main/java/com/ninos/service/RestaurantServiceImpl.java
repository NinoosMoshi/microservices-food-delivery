package com.ninos.service;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ninos.mapper.RestaurantMapper;
import com.ninos.model.dto.RestaurantDTO;
import com.ninos.model.entity.Restaurant;
import com.ninos.repository.RestaurantRepo;

@AllArgsConstructor
@Service
public class RestaurantServiceImpl implements RestaurantService{

    private final RestaurantRepo restaurantRepo;
    private final RestaurantMapper restaurantMapper;


    @Override
    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();
        return restaurants.stream().map(restaurant -> restaurantMapper.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
    }


    @Override
    public RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO) {
        Restaurant restaurant = restaurantRepo.save(restaurantMapper.mapRestaurantDTOToRestaurant(restaurantDTO));
        return restaurantMapper.mapRestaurantToRestaurantDTO(restaurant);
    }

    @Override
    public RestaurantDTO fetchRestaurantById(Long id) {
        Optional<Restaurant> restaurant = restaurantRepo.findById(id);
        if (restaurant.isPresent()){
           return restaurantMapper.mapRestaurantToRestaurantDTO(restaurant.get());
        }
           return null;
    }


}
