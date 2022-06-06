package com.technews.repository;

import com.technews.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//we specify integer to import the user id from User
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email) throws Exception;
}
