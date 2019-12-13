package com.dojo.stage.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Competence {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String competence;
    @Column
    private String decriptif;

    public Competence(){
    };

    public Competence(Long id, String competence, String decriptif) {
        this.id = id;
        this.competence = competence;
        this.decriptif = decriptif;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getDecriptif() {
        return decriptif;
    }

    public void setDecriptif(String decriptif) {
        this.decriptif = decriptif;
    }

    @Override
    public String toString() {
        return "Competence{" +
                "id=" + id +
                ", competence='" + competence + '\'' +
                ", decriptif='" + decriptif + '\'' +
                '}';
    }
}
