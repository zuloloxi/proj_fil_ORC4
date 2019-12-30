package com.dojo.stage.domain;

public class Competence {
    private Long id;
    private String competence;
    private String decriptif;


    public Competence(Long id, String competence, String decriptif) {
        this.id = id;
        this.competence = competence;
        this.decriptif = decriptif;
    }

    public Long getId() {
        return id;
    }

    public String getCompetence() {
        return competence;
    }

    public String getDecriptif() {
        return decriptif;
    }


    public void update (Competence competenceForUpdate) {
        this.competence = competenceForUpdate.competence;
        this.decriptif = competenceForUpdate.decriptif;
    }



}
