package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="person")
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long person_id;

    private Long date_creation;
    private Long date_modification;
    private String name;
    private String surname;
    private String email;

}
