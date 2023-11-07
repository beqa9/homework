package com.example.shop.repositories;

import com.example.shop.entities.Data;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DataRepository extends JpaRepository<Data, Long> {
    boolean existsByLatitudeAndLongitude(Double latitude, Double longitude);

}
