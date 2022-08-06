package com.billing.app.repository;

import com.billing.app.model.User;
import com.billing.app.model.UserAuthentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAuthenticationRepository extends JpaRepository<UserAuthentication, Long> {

    @Query("SELECT s FROM User s WHERE s.emailID = ?1 and s.password = ?2")
    Optional<User> findByEmailAndPassword(String email, String password);

}
