package com.example.API.InterceptorMiddleware01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("gettime")
    public String getCurrentDateTime() {
        return  "Current date and time: " + LocalDateTime.now();
    }
    //localhost:8080/time
}
