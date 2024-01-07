package com.qualco.challenge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "regions")
public class Region {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="region_id")
    private Integer id;
    @Column(name="name")
    private String name;

    //@ManyToOne(fetch = FetchType.LAZY)
    //private Continent continent;

    @OneToMany(mappedBy = "region", fetch = FetchType.LAZY)
    @JsonIgnore
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

    public List<Country> getCountries() {
        return countries;
    }
}
