package com.github.aleksanderweber.techdrawingmanagement.model.data;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor@AllArgsConstructor
@ToString(exclude = "id")
@Getter @Setter @EqualsAndHashCode (of = "id")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "is_finished")
    private boolean isFinished = false;

    @Column(name = "project_manager")
    private String manager;

    @OneToMany(mappedBy = "drawing")
    private Set<Drawing> drawing;
    
    @Column(name =" drawing_count")
    private int drawingCount;

}
