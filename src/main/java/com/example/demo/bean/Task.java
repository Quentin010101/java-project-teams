package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "task")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long task_id;

    private Long date_creation;

    private Long date_modification;

    private Long date_echeance;

    private String title;

    private String description;


    @OneToMany(mappedBy="task")
    private List<Note> notes;

    @ManyToOne
    @JoinColumn(name="state_id")
    private State state;

    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;

    @ManyToMany
    @JoinTable(
            name = "pivot_task_person",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private List<Person> persons;
}
