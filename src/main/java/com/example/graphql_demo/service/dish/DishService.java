package com.example.graphql_demo.service.dish;

import com.example.graphql_demo.model.Dish;

import java.util.List;

/*
    getDishById(id: ID): Dish,
    getDishes:[Dish],
    getDishByTitle(title: String):Dish,
    getDishesCheaperThanValue(value: Float):[Dish]
 */
public interface DishService {

    Dish createDish(Dish dish);

    Dish getDishById(final Long id);

    List<Dish> getDishes();

    Dish getDishByTitle(final String title);

    List<Dish> getDishesCheaperThanValue(final Double value);
}
