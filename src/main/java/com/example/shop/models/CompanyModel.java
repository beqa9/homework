package com.example.shop.models;

import lombok.Builder;

@Builder
public record CompanyModel(
        Integer id,
        Integer parentId,
        Integer countryId,
        String name,
        String nameGeo
){}