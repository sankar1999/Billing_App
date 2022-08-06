package com.billing.app.service;

import com.billing.app.model.User;
import com.billing.app.model.UserAuthentication;
import com.billing.app.repository.UserAuthenticationRepository;
import com.billing.app.responseDetails.Data;
import com.billing.app.responseDetails.ResponseDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class UserAuthenticationService {

    @Autowired
    private UserAuthenticationRepository userAuthenticationRepository;

    public ResponseDetails signIn(UserAuthentication userAuthentication) {
        //*************
        Optional<User> checkByEmailAndPassword = userAuthenticationRepository.findByEmailAndPassword(userAuthentication.getEmailID(), userAuthentication.getPassword());

        ResponseDetails responseDetails = new ResponseDetails(1004, "Invalid Credential");

        if(checkByEmailAndPassword.isPresent()) {

            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
            int capacity = 15;
            StringBuilder GeneratedToken = new StringBuilder(capacity);
            for (int i=0; i<capacity; i++) {
                int index = (int) (AlphaNumericString.length() * Math.random());
                GeneratedToken.append(AlphaNumericString.charAt(index));
            }
            responseDetails = new ResponseDetails(1003, "Signed-In", new Data(GeneratedToken.toString()));

        }
        return responseDetails;
    }
}
