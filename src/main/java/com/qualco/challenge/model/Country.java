package com.qualco.challenge.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="country_id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="area")
    private float area;
    @Column(name="nationalDay")
    private Date nationalDay;
    @Column(name="country_code2")
    private String countryShortCode ;

    @Column(name="country_code3")
    private String countryLongCode;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "country_languages", joinColumns = @JoinColumn(name = "country_id"), inverseJoinColumns = @JoinColumn(name = "language_id"))
    private List<Language> languages;

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

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Date getNationalDay() {
        return nationalDay;
    }

    public void setNationalDay(Date nationalDay) {
        this.nationalDay = nationalDay;
    }

    public String getCountryShortCode() {
        return countryShortCode;
    }

    public void setCountryShortCode(String countryShortCode) {
        this.countryShortCode = countryShortCode;
    }

    public String getCountryLongCode() {
        return countryLongCode;
    }

    public void setCountryLongCode(String countryLongCode) {
        this.countryLongCode = countryLongCode;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Language> getLanguages() {
        return languages;
    }
}
