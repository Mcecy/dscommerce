package com.mcecy.dscommerce.entities;

import jakarta.persistence.Entity;

@Entity
@Table
public class OrderItem {

    private Integer quantity;
    private Double price;
}
