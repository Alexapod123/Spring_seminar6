package com.example.sem6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthday;

    private String married;

//    public User(String name, LocalDate birthday, String married) {
//        this.name = name;
//        this.birthday = birthday;
//        this.married = married;
//    }
}
