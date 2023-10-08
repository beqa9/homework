package com.example.shop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(schema = "public", name = "companies")
public class Companies {

    @Id
    private Integer id;

    @Column(name="parent_id")
    private Integer parent_id;

    @Column(name="country_id")
    private Integer country_id;

    @Column(name="name")
    private String name;

    @Column(name="name_geo")
    private String nameGeo;

    @Column(name="active")
    private boolean active;

    @Column(name="changed_by")
    private Integer changedBy;

    @Column(name="created_by")
    private Integer createdBy;
}
