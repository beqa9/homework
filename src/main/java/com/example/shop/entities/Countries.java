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
@Table(schema = "public", name = "countries")
public class Countries {

    @Id
    private Integer id;

    @Column(name="iso_code_2")
    private String isoCode2;

    @Column(name="iso_code_3")
    private String isoCode3;

    @Column(name="name")
    private String name;

    @Column(name="name_geo")
    private String nameGeo;

}
