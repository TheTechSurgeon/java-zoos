package com.lambdaschool.zoos.models;

import javax.persistence.*;
@Entity
@Table(name="zooanimals")
public class ZooAnimals {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooanimalid;
}
