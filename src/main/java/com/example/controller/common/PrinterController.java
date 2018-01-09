package com.example.controller.common;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrinterController {

    @GetMapping("/printer")
    public String printer() {
        return "/pages/printer.html";
    }
}
