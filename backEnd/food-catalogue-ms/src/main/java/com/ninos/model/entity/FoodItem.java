package com.ninos.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String itemName;

    private String itemDescription;

    private boolean isVeg;

    private Long price;

    private Long restaurantId;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 0") // INT DEFAULT 0: mean initial quantity is 0
    private Integer quantity;

}
