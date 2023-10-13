package com.example.shop.models;

import lombok.Builder;

@Builder
public record ProductModel(
        Integer id,
        String ean,
        String name,
        Integer companyID,
        Integer countryID
) {}
