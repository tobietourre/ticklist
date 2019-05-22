package com.climbing.ticklist.model;

import javax.persistence.*;

@Entity
public class Crag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String city;

    @Column
    private Integer numberOfRoutes;

    @ManyToMany
    private Orientation orientation;

    @OneToOne
    private Enum cotationMin;

    @OneToOne
    private Enum cotationMax;

    public Crag(String name, String city, Integer numberOfRoutes, Orientation orientation, Grade cotationMin, Grade cotationMax) {
        this.name = name;
        this.city = city;
        this.numberOfRoutes = numberOfRoutes;
        this.orientation = orientation;
        this.cotationMin = cotationMin;
        this.cotationMax = cotationMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNumberOfRoutes() {
        return numberOfRoutes;
    }

    public void setNumberOfRoutes(Integer numberOfRoutes) {
        this.numberOfRoutes = numberOfRoutes;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Enum getCotationMin() {
        return cotationMin;
    }

    public void setCotationMin(Enum cotationMin) {
        this.cotationMin = cotationMin;
    }

    public Enum getCotationMax() {
        return cotationMax;
    }

    public void setCotationMax(Enum cotationMax) {
        this.cotationMax = cotationMax;
    }


}
