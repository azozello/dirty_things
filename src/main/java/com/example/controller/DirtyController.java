package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirtyController {

    @RequestMapping("/dirty_things/{scroll}")
    public String doDirtyThings(@PathVariable int scroll) {
        return "Грязные делишки были сделаны "+scroll+" раз!";
    }
}
