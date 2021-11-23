package com.example.graphql_demo.service.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql_demo.model.Dish;
import com.example.graphql_demo.service.dish.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DishMutation implements GraphQLMutationResolver {

  private final DishService dishService;

  public Dish createDish(final String title, final String description, final Double cost) {

    Dish dish = Dish.builder().title(title).description(description).cost(cost).build();

    return dishService.createDish(dish);
  }
}
