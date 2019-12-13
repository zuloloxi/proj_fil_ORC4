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
    public Competence(Long id, String competence, String descriptifCompetence) {
        this.id = id;
        this.competence = competence;
        this.decriptif = descriptifCompetence;
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

    public String getDescriptifCompetence() {
        return decriptif;
    }

    public void setDescriptifCompetence(String descriptifCompetence) {
        this.decriptif = descriptifCompetence;
    }

    @Override
    public String toString() {
        return "CompetencesParPoste{" +
                "id=" + id +
                ", competence='" + competence + '\'' +
                ", descriptifCompetence='" + decriptif + '\'' +
                '}';
    }
}
