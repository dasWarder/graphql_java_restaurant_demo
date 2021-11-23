package com.example.graphql_demo.service;

import com.example.graphql_demo.model.Restaurant;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface RestaurantService {

    Restaurant createRestaurant(Restaurant restaurant);

    Restaurant getRestaurantById(Long id);

    Restaurant getRestaurantByTitle(String title);

    List<Restaurant> getRestaurants(int count);

    List<Restaurant> getRestaurantByOpenCloseTime(Double from, Double due);
}
