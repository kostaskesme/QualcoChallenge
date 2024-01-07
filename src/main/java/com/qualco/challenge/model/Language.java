package com.qualco.challenge.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "language_id")
    private Integer id;

    @Column(name = "language")
    private String name;

    @ManyToMany(mappedBy = "languages")
    private List<Country> countries;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
