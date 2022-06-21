package com.veyselozturk.socialmedia.controller;

import com.veyselozturk.socialmedia.entity.User;
import com.veyselozturk.socialmedia.repository.UserRepository;
import com.veyselozturk.socialmedia.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    //private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping("/api/1.0/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user){
        //log.info(user.toString());
        //System.out.println(user.toString());
        userService.save(user);
    }
}
