package com.github.fillsky.techdrawing.model.repositories;

import com.github.fillsky.techdrawing.model.data.Role;
import com.github.fillsky.techdrawing.model.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByRole(Role role);
    List<User> findAllByLogin(String login);
    User findByLogin(String login);
}
