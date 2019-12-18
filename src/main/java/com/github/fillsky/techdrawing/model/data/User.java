package com.github.fillsky.techdrawing.model.data;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "id")
@Getter
@Setter
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
}
