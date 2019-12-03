package com.github.aleksanderweber.techdrawingmanagement.model.mappers;

import com.github.aleksanderweber.techdrawingmanagement.model.data.Role;
import com.github.aleksanderweber.techdrawingmanagement.model.data.User;
import com.github.aleksanderweber.techdrawingmanagement.model.dto.UserRegisterDTO;
import org.springframework.stereotype.Controller;

@Controller
public class UserMapper {


    public User convert (UserRegisterDTO dto){

        User user = new User ();
        user.setRole(Role.USER);
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setPassword(dto.getPassword());
        user.setLogin(dto.getLogin());
        return user;
    }
}
