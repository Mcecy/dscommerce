package com.mcecy.dscommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {

    @I
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
}
