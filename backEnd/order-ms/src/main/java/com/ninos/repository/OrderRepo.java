package com.ninos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ninos.model.entity.Order;

public interface OrderRepo extends MongoRepository<Order, Long> {
}
