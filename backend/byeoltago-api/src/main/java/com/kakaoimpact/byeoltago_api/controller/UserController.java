package com.kakaoimpact.byeoltago_api.controller;

import com.kakaoimpact.byeoltago_api.model.User;
import com.kakaoimpact.byeoltago_api.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;


    @PostMapping("/login")
    public Boolean login(@RequestBody User user) {
        return userService.login(user.getEmail());
    }
}
