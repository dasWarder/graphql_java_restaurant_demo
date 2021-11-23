package com.example.graphql_demo.repository;

import com.example.graphql_demo.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DishRepository extends JpaRepository<Dish, Long> {

    Optional<Dish> getDishByTitle(String title);

    List<Dish> getDishesByCostBefore(Double cost);
}
