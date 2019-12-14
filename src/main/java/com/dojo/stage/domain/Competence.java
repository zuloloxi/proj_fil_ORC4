package com.dojo.stage.domain;




public class Competence {
    private String competence;
    private String decriptif;


    public Competence(String competence, String decriptif) {
        this.competence = competence;
        this.decriptif = decriptif;
    }

    public String getCompetence() {
        return competence;
    }

    public String getDecriptif() {
        return decriptif;
    }
}
