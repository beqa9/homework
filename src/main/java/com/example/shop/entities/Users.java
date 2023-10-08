package com.example.shop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(schema = "public", name = "users")
public class Users {

    @Id
    private Integer id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="active")
    private boolean active;

    @Column(name="changed_by")
    private Integer changedBy;

    @Column(name="created_by")
    private Integer createdBy;
}
