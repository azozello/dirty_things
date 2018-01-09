package com.example.controller;

import com.example.dto.DTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DirtyController {

    @PostMapping("/dirty_things")
    public List<Integer> doDirtyThings(@RequestBody DTO dto) {
        List<Integer> list = new ArrayList<>();
        list.add(dto.getSlider_value()*5);
        list.add(dto.getSlider_value()*9);
        return list;
    }
}
