package com.ninos.service;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ninos.mapper.OrderMapper;
import com.ninos.model.dto.OrderDTO;
import com.ninos.model.dto.OrderDTOFromFE;
import com.ninos.model.dto.UserDTO;
import com.ninos.model.entity.Order;
import com.ninos.repository.OrderRepo;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepo orderRepo;
    private final OrderMapper orderMapper;
    private final RestTemplate restTemplate;
    private final SequenceGenerator sequenceGenerator;



    @Override
    public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {
        Long newOrderID = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO =  fetchUserDetailsFromUserId(orderDetails.getUserId());
        Order orderToBeSaved = new Order(newOrderID, orderDetails.getFoodItemsList(), orderDetails.getRestaurant(), userDTO );
        orderRepo.save(orderToBeSaved);
        return orderMapper.mapOrderToOrderDto(orderToBeSaved);
    }

    private UserDTO fetchUserDetailsFromUserId(Long userId) {
        return restTemplate.getForObject("http://USER-SERVICE/api/v1/user/fetchUserById/" + userId, UserDTO.class);
    }


}
