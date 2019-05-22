package com.climbing.ticklist.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private Date dateNaissance;

    @Column
    private String login;

    @Column
    private String password;

    @OneToMany (mappedBy = "user")
    private HashSet<Ascent> ascents;

}
