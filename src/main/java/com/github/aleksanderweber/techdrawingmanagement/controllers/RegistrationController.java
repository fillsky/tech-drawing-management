package com.github.aleksanderweber.techdrawingmanagement.controllers;

import com.github.aleksanderweber.techdrawingmanagement.model.data.Role;
import com.github.aleksanderweber.techdrawingmanagement.model.data.User;
import com.github.aleksanderweber.techdrawingmanagement.model.dto.UserRegisterDTO;
import com.github.aleksanderweber.techdrawingmanagement.model.mappers.UserMapper;
import com.github.aleksanderweber.techdrawingmanagement.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class RegistrationController {

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Autowired
    public RegistrationController(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("dto", new UserRegisterDTO());
        return "users/register-user";
    }

    @GetMapping("/success")
    public String successfulRegistration(){

        return "users/success";
    }

    @PostMapping("/register-user")
    public String registerUser(@ModelAttribute UserRegisterDTO dto, HttpServletResponse response) throws IOException {
        if (!dto.getPassword().equals(dto.getConfPassword())) {
            response.sendError(401, "Password does not match");
        }

        List<User> users = userRepository.findAllByLogin(dto.getLogin());
        if (!users.isEmpty()) {
            response.sendError(401, "User by given login already exist");
        }

        userRepository.save(userMapper.convert(dto));

        return "users/success";
    }


}
