package com.mcecy.dscommerce.entities;

import java.time.LocalDate;

public class User {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String password;
    private String[] roles;

    public User() {
    }

    
}
