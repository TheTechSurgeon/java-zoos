package com.lambdaschool.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="zoos")
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    @Column(nullable=false, unique = true)
    private String zooname;

    @OneToMany(mappedBy = "zoo",
    cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value="zoos",allowSetters = true)
    private Set<ZooAnimal> zooAnimal = new HashSet<>();
    //default constructor
    public Zoo(){

    }
    //constructor
    public Zoo(long zooid, String zooname) {
        this.zooid = zooid;
        this.zooname = zooname;
    }
    //getter and setters
    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }
}
