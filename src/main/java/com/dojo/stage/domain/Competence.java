package com.dojo.stage.domain;

public class Competence {
    private Long id;
    private String competence;
    private String descriptif;


    public Competence(Long id, String competence, String descriptif) {
        this.id = id;
        this.competence = competence;
        this.descriptif = descriptif;
    }

    public Long getId() {
        return id;
    }

    public String getCompetence() {
        return competence;
    }

    public String getDescriptif() {
        return descriptif;
    }


    public void update (Competence competenceForUpdate) {
        this.competence = competenceForUpdate.competence;
        this.descriptif = competenceForUpdate.descriptif;
    }



}
