package com.ninos.service;

import com.ninos.model.dto.OrderDTO;
import com.ninos.model.dto.OrderDTOFromFE;

public interface OrderService {

    OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails);

}
