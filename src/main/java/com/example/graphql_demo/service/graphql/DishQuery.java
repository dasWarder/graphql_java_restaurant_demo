package com.example.graphql_demo.service.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql_demo.model.Dish;
import com.example.graphql_demo.service.dish.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/*
    Dish getDishById(final Long id);
    List<Dish> getDishes();
    Dish getDishByTitle(final String title);
    List<Dish> getDishesCheaperThanValue(final Double value);
 */

@Component
@RequiredArgsConstructor
public class DishQuery implements GraphQLQueryResolver {

    private final DishService dishService;

    public Dish getDishById(final Long id) {
        return dishService.getDishById(id);
    }

    public List<Dish> getDishes() {
        return dishService.getDishes();
    }

    public Dish getDishByTitle(final String title) {
        return dishService.getDishByTitle(title);
    }

    public List<Dish> getDishesCheaperThanValue(final Double value) {
        return dishService.getDishesCheaperThanValue(value);
    }
}
