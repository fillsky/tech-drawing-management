package com.github.aleksanderweber.techdrawingmanagement.services;

import com.github.aleksanderweber.techdrawingmanagement.model.dto.UserRegisterDTO;
import com.github.aleksanderweber.techdrawingmanagement.model.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
