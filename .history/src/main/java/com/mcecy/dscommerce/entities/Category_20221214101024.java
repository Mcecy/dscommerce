package com.mcecy.dscommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_category")
public class Category {

    private Long id;
    private String name;
}
