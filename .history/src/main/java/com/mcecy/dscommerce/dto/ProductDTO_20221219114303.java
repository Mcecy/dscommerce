package com.mcecy.dscommerce.dto;

public class ProductDTO {

    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Double price;
    private String imgUrl;
}
