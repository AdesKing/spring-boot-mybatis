package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/3 0003.
 */
@RestController
public class UserController {
    @Autowired
    private UserMap userMap;
    @RequestMapping("/")
    public String addUser(User user){
        System.out.print(user.getPassword());
        //userMap.insert(user);
        return "index";
    }
}
