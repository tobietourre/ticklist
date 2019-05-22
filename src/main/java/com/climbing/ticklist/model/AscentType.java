package com.climbing.ticklist.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
public enum AscentType {
    REDPOINT ((short)1,"Redpoint"),
    ONSIGHT ((short)2,"Onsight"),
    FLASH ((short)3,"Flash"),
    TOPROPE ((short)4,"Toprope");

    @Id
    private Short id;

    @Column
    private String libelle;

    private AscentType(Short id, String libelle){
        this.libelle = libelle;
    }
}
