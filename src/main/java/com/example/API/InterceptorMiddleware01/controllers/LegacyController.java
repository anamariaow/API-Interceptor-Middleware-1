package com.example.API.InterceptorMiddleware01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @GetMapping("/getmessage")
    public String getLegacyMessage() {
        return "This is just old code";
    }
}
