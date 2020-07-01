package ru.danbka.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/1/2020: 3:56 PM
 */
@RestController
public class HelloWorldController {
    @GetMapping("/sayHi")
    public String sayHi() {
        return "Hi";
    }
}
