package com.mcecy.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcecy.dscommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email)
}
