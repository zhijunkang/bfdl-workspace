package com.example.cloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cloud.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
