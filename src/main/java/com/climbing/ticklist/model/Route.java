package com.climbing.ticklist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Route {
    @Column
    private String name;

    @OneToOne
    private Crag crag;

    @OneToOne
    private Grade grade;


    public Route(String name, Crag crag, Grade grade) {
        this.name = name;
        this.crag = crag;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Crag getCrag() {
        return crag;
    }

    public void setCrag(Crag crag) {
        this.crag = crag;
    }

    public Enum getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }


}
