package com.lambdaschool.zoos.models;

import javax.persistence.*;

@Entity
@Table(name="animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    @Column(nullable = false)
    private String animaltype;

    @Column
    private String incomingzoo;


}
