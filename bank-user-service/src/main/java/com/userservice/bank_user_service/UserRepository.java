package com.userservice.bank_user_service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.bank_user_service.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
