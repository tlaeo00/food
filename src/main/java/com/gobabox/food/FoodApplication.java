package com.gobabox.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SuppressWarnings("SpringBootApplicationSetup")
@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class FoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodApplication.class, args);
    }

}

