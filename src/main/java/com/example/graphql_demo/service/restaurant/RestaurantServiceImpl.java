package com.example.graphql_demo.service.restaurant;

import com.example.graphql_demo.model.Restaurant;
import com.example.graphql_demo.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

  private final RestaurantRepository restaurantRepository;

  @Override
  @Transactional
  public Restaurant createRestaurant(Restaurant restaurant) {

    log.info("Create a new restaurant");

    return restaurantRepository.save(restaurant);
  }

  @Override
  @Transactional(readOnly = true)
  public Restaurant getRestaurantById(Long id) {

    log.info("Fetch a restaurant by its ID = {}", id);

    return restaurantRepository.findById(id).orElseThrow(NullPointerException::new);
  }

  @Override
  @Transactional(readOnly = true)
  public Restaurant getRestaurantByTitle(String title) {

    log.info("Fetch a restaurant by its title = {}", title);

    return restaurantRepository.getRestaurantByTitle(title).orElseThrow(NullPointerException::new);
  }

  @Override
  @Transactional(readOnly = true)
  public List<Restaurant> getRestaurants(int count) {

    log.info("Fetch all restaurants");

    return restaurantRepository.findAll().stream().limit(count).collect(Collectors.toList());
  }

  @Override
  @Transactional(readOnly = true)
  public List<Restaurant> getRestaurantByOpenCloseTime(Double from, Double due) {

    log.info("Fetch all restaurants with open hours between {} and {}", from, due);

    return restaurantRepository.getRestaurantsByFromAfterAndDueBefore(from, due);
  }
}
