package com.example.shop.repositories;

import com.example.shop.entities.Companies;
import com.example.shop.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users,Integer> {
    List<Users> findAll();
}