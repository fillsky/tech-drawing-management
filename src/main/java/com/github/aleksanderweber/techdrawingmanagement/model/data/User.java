package com.github.aleksanderweber.techdrawingmanagement.model.data;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "id")
@EqualsAndHashCode (of = {"id","login"})
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany (mappedBy = "user")
    private Set<Project> projects;
    @OneToMany (mappedBy = "user")
    private Set<Drawing> drawings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public Set<Drawing> getDrawings() {
        return drawings;
    }

    public void setDrawings(Set<Drawing> drawings) {
        this.drawings = drawings;
    }
}
