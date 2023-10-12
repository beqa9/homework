package com.example.shop.repositories;

import com.example.shop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User,Integer> {
    List<User> findAll();
    Optional<User> findAllByUsername(String username);
}