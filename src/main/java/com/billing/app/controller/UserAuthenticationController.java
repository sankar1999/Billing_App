package com.billing.app.controller;

import com.billing.app.model.UserAuthentication;
import com.billing.app.responseDetails.ResponseDetails;
import com.billing.app.service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserAuthenticationController {

    @Autowired
    private UserAuthenticationService userAuthenticationService;

    @PostMapping("/signin")
    public ResponseDetails signIn(@RequestBody UserAuthentication userAuthentication) {
        return userAuthenticationService.signIn(userAuthentication);
    }
}
