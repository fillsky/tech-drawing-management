package com.github.aleksanderweber.techdrawingmanagement.controllers;

import com.github.aleksanderweber.techdrawingmanagement.model.dto.UserRegisterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("dto", new UserRegisterDTO());
        return "users/register-user";
        //return "header";
    }

    @PostMapping("register-user")
    public void registerUser(@ModelAttribute UserRegisterDTO dto) {
        return;
    }
}
