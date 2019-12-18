package com.github.fillsky.techdrawing.model.data;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor@AllArgsConstructor
@ToString(exclude = "id")
@Getter @Setter @EqualsAndHashCode (of = "id")
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "is_finished")
    private boolean isFinished = false;

    @Column(name = "project_manager")
    private String manager;

    @OneToMany(mappedBy = "project")
    private Set<Drawing> drawings;

    @Column(name ="drawing_count")
    private int drawingCount;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
