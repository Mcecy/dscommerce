package com.mcecy.dscommerce.services;

import org.springframework.stereotype.Service;

import com.mcecy.dscommerce.repositories.ProductRepository;

@Service
public class ProductService {

    @Auto
    private ProductRepository repository;
}
