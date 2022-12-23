package com.mcecy.dscommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_roles")
public class Role {

    @Id
    private Long id;
    private String authority;
}
