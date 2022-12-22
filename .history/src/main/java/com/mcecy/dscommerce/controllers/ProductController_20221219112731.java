package com.mcecy.dscommerce.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/products")
public class ProductController {

    public String teste() {
        return "Ola mundo"
    }
}
