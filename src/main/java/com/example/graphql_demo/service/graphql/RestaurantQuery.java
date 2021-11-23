package com.example.graphql_demo.service.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql_demo.model.Restaurant;
import com.example.graphql_demo.service.restaurant.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RestaurantQuery implements GraphQLQueryResolver {

    private final RestaurantService restaurantService;

    public List<Restaurant> getRestaurants(final Integer count) {
        return restaurantService.getRestaurants(count);
    }

    public Restaurant getRestaurantById(final Long id) {
        return restaurantService.getRestaurantById(id);
    }

    public Restaurant getRestaurantByTitle(final String title) {
        return restaurantService.getRestaurantByTitle(title);
    }

    public List<Restaurant> getRestaurantsByOpenCloseHours(final Double from, final Double due) {
        return restaurantService.getRestaurantByOpenCloseTime(from, due);
    }
}
