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
@Table(schema = "public", name = "products")
public class Products {

    @Id
    private Integer id;

    @Column(name="ean")
    private String ean;

    @Column(name="name")
    private String name;

    @Column(name="company_id")
    private Integer companyId;

    @Column(name="country_id")
    private Integer countryId;

    @Column(name="description")
    private String description;

    @Column(name="active")
    private boolean active;

    @Column(name="changed_by")
    private Integer changedBy;

    @Column(name="created_by")
    private Integer createdBy;
}
