package com.climbing.ticklist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public enum Orientation {
    NORD ((short)1,"Nord"),
    SUD ((short)2,"Sud"),
    EST ((short)3,"Est"),
    OUEST((short)4,"Ouest"),
    NORD_EST ((short)5,"Nord-Est"),
    SUD_EST ((short)6,"Sud-Est"),
    NORD_OUEST ((short)7,"Nord-Ouest"),
    SUD_OUEST ((short)8,"Sud-Ouest");

    @Id
    private Short id;

    @Column
    private String libelle;

    private Orientation(Short id, String libelle){
        this.id = id;
        this.libelle = libelle;
    }
}
