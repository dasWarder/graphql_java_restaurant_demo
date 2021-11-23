package com.example.graphql_demo.repository;

import com.example.graphql_demo.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    Optional<Restaurant> getRestaurantByTitle(String title);

    List<Restaurant> getRestaurantsByFromAfterAndDueBefore(Double from, Double due);
}
