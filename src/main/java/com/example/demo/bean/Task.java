package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    private String[] notes;

    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;


    private Person[] persons;
}
