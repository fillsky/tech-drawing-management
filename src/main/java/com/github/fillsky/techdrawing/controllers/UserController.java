package com.github.fillsky.techdrawing.controllers;

import com.github.fillsky.techdrawing.model.data.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Controller
@RequestMapping("/user")
public class UserController {

    private Map<Long, User> userRepository = new ConcurrentHashMap<>();

    public Map<Long, User> getUserRepository() {
        return userRepository;
    }

    @GetMapping
    @ResponseBody
    public List<User> getAllUsers() {

        return new ArrayList<>(userRepository.values());
    }

}