package com.github.aleksanderweber.techdrawingmanagement.model.dto;


import com.github.aleksanderweber.techdrawingmanagement.model.data.Role;
import com.github.aleksanderweber.techdrawingmanagement.model.data.User;

public class UserRegisterDTO {

    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String confPassword;

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    }


