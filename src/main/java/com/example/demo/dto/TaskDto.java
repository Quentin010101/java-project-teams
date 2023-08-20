package com.example.demo.dto;

import com.example.demo.bean.Note;
import com.example.demo.bean.Person;
import com.example.demo.bean.State;
import jakarta.persistence.*;

import java.util.List;

public class TaskDto {
    private Long task_id;

    private Long date_creation;

    private Long date_modification;

    private Long date_echeance;

    private String title;

    private String description;

    private List<Note> notes;

    private State state;

    private Person person;

    private List<Person> persons;
}
