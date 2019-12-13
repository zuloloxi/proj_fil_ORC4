package com.dojo.stage.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Competences {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String competence;
    @Column
    private String descriptifCompetence;

    public Competences(){

    };
    public Competences(Long id, String competence, String descriptifCompetence) {
        this.id = id;
        this.competence = competence;
        this.descriptifCompetence = descriptifCompetence;
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
        return descriptifCompetence;
    }

    public void setDescriptifCompetence(String descriptifCompetence) {
        this.descriptifCompetence = descriptifCompetence;
    }

    @Override
    public String toString() {
        return "CompetencesParPoste{" +
                "id=" + id +
                ", competence='" + competence + '\'' +
                ", descriptifCompetence='" + descriptifCompetence + '\'' +
                '}';
    }
}
