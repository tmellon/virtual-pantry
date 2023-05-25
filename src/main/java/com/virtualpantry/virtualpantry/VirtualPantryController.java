package com.virtualpantry.virtualpantry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VirtualPantryController {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }
}
