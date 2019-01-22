package com.gobabox.food.service;

import com.gobabox.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repository;

    public void getUser() {
        repository.selectUser().forEach(s -> {
            System.out.println("==>" + s);
        });
    }

}
