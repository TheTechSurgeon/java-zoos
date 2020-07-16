package com.lambdaschool.zoos.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="zooanimals")
public class ZooAnimal {

    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Animal animal;

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Zoo zoo;

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if(!(o instanceof ZooAnimal)){
            return false;
        }
        ZooAnimal that = (ZooAnimal) o;
        return ((this.zoo == null)?0: this.zoo.getZooid()) == ((that.zoo == null)? 0:that.zoo.getZooid() &&
                (this.animal == null)?0: this.animal.getAnimalid()) == ((that.zoo == null)? 0:that.zoo.getAnimalid())
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal, zoo);
    }
}
