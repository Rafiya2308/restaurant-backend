package com.restaurant.management.restaurantbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RestaurantBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantBackendApplication.class, args);
    }

}
