package com.mcecy.dscommerce.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_roles")
public class Role {

    @Id
    @GeneratedValue(st)
    private Long id;
    private String authority;
}
