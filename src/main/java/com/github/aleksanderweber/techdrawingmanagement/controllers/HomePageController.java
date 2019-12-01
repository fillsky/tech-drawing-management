package com.github.aleksanderweber.techdrawingmanagement.controllers;

import com.github.aleksanderweber.techdrawingmanagement.model.data.Role;
import com.github.aleksanderweber.techdrawingmanagement.model.data.User;
import com.github.aleksanderweber.techdrawingmanagement.model.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class HomePageController {

    public HomePageController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;
    @GetMapping("/home")
    public String showHomepage(Model model) {
        List<User> users = userRepository.findByRole(Role.USER);
        model.addAttribute("users", users);
        return "home";
    }

    @GetMapping("/login")
    public String loginPage(){

        return "/login";
    }
}
