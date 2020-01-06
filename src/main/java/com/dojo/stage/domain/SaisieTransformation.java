package com.dojo.stage.domain;

public class SaisieTransformation {

    private Long CollaborateurId;
    private String domaine;
    private String equipe;
    private String profil;
    private String competences;

    public SaisieTransformation(Long collaborateurId, String domaine, String equipe, String profil, String competences) {
        CollaborateurId = collaborateurId;
        this.domaine = domaine;
        this.equipe = equipe;
        this.profil = profil;
        this.competences = competences;
    }

    public Long getCollaborateurId() {
        return CollaborateurId;
    }

    public String getDomaine() {
        return domaine;
    }

    public String getEquipe() {
        return equipe;
    }

    public String getProfil() {
        return profil;
    }

    public String getCompetences() {
        return competences;
    }

    public void update (SaisieTransformation saisieTransformationForUpdate) {
        this.CollaborateurId = saisieTransformationForUpdate.CollaborateurId;
        this.domaine = saisieTransformationForUpdate.domaine;
        this.equipe = saisieTransformationForUpdate.equipe;
        this.profil = saisieTransformationForUpdate.profil;
        this.competences = saisieTransformationForUpdate.competences;
    }

}