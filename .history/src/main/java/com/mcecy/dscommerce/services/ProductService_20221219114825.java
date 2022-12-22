package com.mcecy.dscommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcecy.dscommerce.dto.ProductDTO;
import com.mcecy.dscommerce.entities.Product;
import com.mcecy.dscommerce.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductDTO findByID(Long id) {
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO(id, product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl())
    }
}
