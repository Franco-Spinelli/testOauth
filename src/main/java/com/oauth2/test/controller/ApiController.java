package com.oauth2.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String welcome (){
        return "welcome";
    }
    @GetMapping("/welcomeSecured")
    public String welcomeSecured (){
        return "welcome secured";
    }
}
