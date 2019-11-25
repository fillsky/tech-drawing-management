package com.github.aleksanderweber.techdrawingmanagement.model.data;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "id")
@Getter @Setter
@EqualsAndHashCode (of ={"name", "id"})
@Table(name = "drawings")
public class Drawing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Column(nullable = false)
    private int level;

    @Column(nullable = false)
    private int sector;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Element element;

    @Column(name = "assigned_worker")
    private String assignedWorker;

    @Column
    private DrawingStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
