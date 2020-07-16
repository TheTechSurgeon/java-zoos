package com.lambdaschool.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="telephones")
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    @Column
    private String phonetype;

    @Column
    private String phonenumber;

    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "telephones", allowSetters = true)
    private Zoo zoo;
}
