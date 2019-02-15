package com.gobabox.food.controller;

import com.gobabox.food.service.FoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FoodController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FoodController.class);

    @Autowired
    private FoodService service;

    @RequestMapping(value="/")
    public ModelAndView getUser() {
        LOGGER.info("index page");
//        service.getUser();
        return new ModelAndView("main", "result", "success123234345465465");
    }

}
