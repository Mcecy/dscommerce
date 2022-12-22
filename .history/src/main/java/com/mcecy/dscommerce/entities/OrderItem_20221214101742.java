package com.mcecy.dscommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {

    private Integer quantity;
    private Double price;
}
