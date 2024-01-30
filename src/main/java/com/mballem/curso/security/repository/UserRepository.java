package com.mballem.curso.security.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long>{
    @Query("select u from User u where u.email like :email")
    User findByEmail(@Param("email") String email);
}
