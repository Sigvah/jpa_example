package no.hvl.dat250.jpa.basicexample;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Adress {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int number;
    private String street;

    @ManyToMany(mappedBy = "adress")
    private final List<Person2> residence = new ArrayList<Person2>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String description) {
        this.street = street;
    }

    public List<Person2> getResidence() {
        return residence;
    }
}

