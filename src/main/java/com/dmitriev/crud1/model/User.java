package com.dmitriev.crud1.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;

    private String email;
}
