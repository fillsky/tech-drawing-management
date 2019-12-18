package com.github.aleksanderweber.techdrawingmanagement.controllers;

import com.github.aleksanderweber.techdrawingmanagement.model.data.Role;
import com.github.aleksanderweber.techdrawingmanagement.model.data.User;
import com.github.aleksanderweber.techdrawingmanagement.model.repositories.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.provider.PolicyParser;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping
public class HomePageController {

    public HomePageController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;

    @GetMapping("/")
    public String showHomepage() {
        return "home";
    }

    @GetMapping("/user-login")
    public String loginPage(){

        return "users/login";
    }

    @GetMapping("/users")
    public String allUsers(Model model) {
        List<User> users = userRepository.findByRole(Role.USER);
        model.addAttribute("users", users);
        return "users/display-all-users";
    }

    @GetMapping("/api/users/me")
    @ResponseBody
    public String loggedUser() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
