package com.lambdaschool.zoos.models;

import javax.persistence.*;

@Entity
@Table(name="zoos")
public class Zoos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    @OneToOne(mappedBy = "zoos",
    cascade = CascadeType.ALL)

}
