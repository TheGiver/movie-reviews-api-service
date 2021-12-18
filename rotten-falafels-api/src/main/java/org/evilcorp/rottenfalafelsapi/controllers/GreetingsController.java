package org.evilcorp.rottenfalafelsapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, this is my first spring boot application";
    }
}
