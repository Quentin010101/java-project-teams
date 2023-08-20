package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "note")
@Getter
@Setter
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long note_id;

    private String name;

    private boolean bool;

    @ManyToOne
    @JoinColumn(name="task_id")
    @JsonIgnore
    private Task task;
}
