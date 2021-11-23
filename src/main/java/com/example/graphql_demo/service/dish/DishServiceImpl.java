package com.example.graphql_demo.service.dish;

import com.example.graphql_demo.model.Dish;
import com.example.graphql_demo.repository.DishRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {

  private final DishRepository dishRepository;

  @Override
  public Dish createDish(Dish dish) {

    log.info("Create a new dish");
    return dishRepository.save(dish);
  }

  @Override
  public Dish getDishById(Long id) {

    log.info("Fetch a dish by ID = {}", id);
    return dishRepository.findById(id).orElseThrow(NullPointerException::new);
  }

  @Override
  public List<Dish> getDishes() {

    log.info("Fetch all dishes");
    return dishRepository.findAll();
  }

  @Override
  public Dish getDishByTitle(String title) {

    log.info("Fetch a dish by the title = {}", title);
    return dishRepository.getDishByTitle(title).orElseThrow(NullPointerException::new);
  }

  @Override
  public List<Dish> getDishesCheaperThanValue(Double value) {

    log.info("Fetch dishes cheaper than value = {}", value);
    return dishRepository.getDishesByCostBefore(value);
  }
}
