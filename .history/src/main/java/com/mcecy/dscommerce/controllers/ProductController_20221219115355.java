package com.mcecy.dscommerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcecy.dscommerce.entities.Product;
import com.mcecy.dscommerce.repositories.ProductRepository;
import com.mcecy.dscommerce.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService;

    @GetMapping
    public String teste() {

    }
}
