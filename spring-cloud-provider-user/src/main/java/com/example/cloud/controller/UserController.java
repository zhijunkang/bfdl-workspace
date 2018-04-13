package com.example.cloud.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.dao.UserRepository;
import com.example.cloud.entity.User;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class UserController {
    
    @Autowired
    private UserRepository ur;
    @Value("${kang.random.string}")
    private String random;
    
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
       
       List<User> us = ur.findAll();
       System.out.println(us.toString());
//       User u = new User();
//       u.setName("kang"+id);
//       u.setAge((short)30);
//       u.setCreateTime(new Date());
//       u.setBalance(new BigDecimal(300));
//       ur.save(u);
        User uu = ur.getOne(id);
        log.info("application random is : {}",random);
        return uu;
    }
}
