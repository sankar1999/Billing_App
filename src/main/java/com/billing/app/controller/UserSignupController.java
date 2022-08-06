package com.billing.app.controller;

import com.billing.app.model.User;
import com.billing.app.service.UserSignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserSignupController {

    @Autowired
    private UserSignupService userSignupService;

    @PostMapping("/signup")
    public String saveSignupDetails(@RequestBody User user) {
        return userSignupService.saveSignupDetails(user);
    }
}
