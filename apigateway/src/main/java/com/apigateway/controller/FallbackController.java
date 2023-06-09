package com.apigateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallBack(){
        return "User Service is Down at this Time!!";
    }

    @GetMapping("/contactServiceFallback")
    public  String contactServiceFallback(){
        return "Contact service is Down at this Time!!";
    }
}
