package com.github.aleksanderweber.techdrawingmanagement.model.data;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private Role role;
    @OneToMany
    private Set<Project> projects;
    @OneToMany
    private Set<Drawing> drawings;
}
