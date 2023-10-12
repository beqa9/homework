package com.example.shop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "public", name = "companies")
public class Company {

    @Id
    private Integer id;

    @Column(name="parent_id")
    private Integer parentId;

    @Column(name="country_id")
    private Integer countryId;

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
