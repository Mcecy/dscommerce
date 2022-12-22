package com.mcecy.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcecy.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Autow
}
