package com.example.shop.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(schema = "public", name = "users")
public class User  {

    @Id
    private Integer id;

    @Column(name = "email")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "changed_by")
    private Integer changedBy;

    @Column(name = "created_by")
    private Integer createdBy;
}





