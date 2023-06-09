package com.user.controller;


import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    //rest Template is used to Communicate with 1 service to Another service

    @GetMapping("/{userId}")
    public User getuser(@PathVariable("userId") Long userId){

         User user = userService.getUser(userId);
       // http://localhost:9002/contact/user/1311
       List contacts =  this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(), List.class);

       user.setContacts(contacts);
        return user;
    }
}
