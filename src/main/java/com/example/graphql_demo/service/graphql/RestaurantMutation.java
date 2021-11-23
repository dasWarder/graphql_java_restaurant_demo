package com.example.graphql_demo.service.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql_demo.model.Restaurant;
import com.example.graphql_demo.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RestaurantMutation implements GraphQLMutationResolver {

  private final RestaurantService restaurantService;

  public Restaurant createRestaurant(
      final String title,
      final String description,
      final String address,
      final double from,
      final double due) {

    Restaurant restaurant =
        Restaurant.builder()
            .title(title)
            .description(description)
            .address(address)
            .from(from)
            .due(due)
            .build();

    return restaurantService.createRestaurant(restaurant);
  }
}
