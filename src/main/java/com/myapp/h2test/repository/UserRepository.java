package com.myapp.h2test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.h2test.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
