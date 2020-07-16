package com.lambdaschool.zoos.models;

import javax.persistence.*;

@Entity
@Table(name="telephones")
public class Telephones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long telephoneid;
}
