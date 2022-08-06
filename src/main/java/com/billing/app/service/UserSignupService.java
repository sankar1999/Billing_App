package com.billing.app.service;

import com.billing.app.model.User;
import com.billing.app.repository.UserSignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSignupService {

    @Autowired
    private UserSignupRepository userSignupRepository;

    public String saveSignupDetails(User user) {
        userSignupRepository.save(user);
        return "Signed Up !!!";
    }
}
