package com.billing.app.config;

import com.billing.app.model.User;
import com.billing.app.repository.UserSignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.Month;
import java.time.LocalDate;
import java.time.Month;

@Configuration
public class UserSignupConfig {


    @Bean
    CommandLineRunner commandLineRunner(UserSignupRepository repository) {
        return args -> {
            User user1 = new User("Justin", "Bieber", "justin@gmail.com", "justin", "male", LocalDate.of(1994, Month.JANUARY, 22), true, 998734565, "Canada");
            repository.save(user1);
        };
    }
}
