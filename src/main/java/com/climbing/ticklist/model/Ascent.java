package com.climbing.ticklist.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Ascent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Route route;

    @Column
    private Date date;

    @ManyToOne
    private Grade grade;

    @Column
    private String commentaire;

    @ManyToOne
    private AscentType ascentType;

    @ManyToOne
    private User user;

    public Ascent(Route route, Date date, Grade grade, String commentaire, AscentType ascentType, User user) {
        this.route = route;
        this.date = date;
        this.grade = grade;
        this.commentaire = commentaire;
        this.ascentType = ascentType;
        this.user = user;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public AscentType getAscentType() {
        return ascentType;
    }

    public void setAscentType(AscentType ascentType) {
        this.ascentType = ascentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
