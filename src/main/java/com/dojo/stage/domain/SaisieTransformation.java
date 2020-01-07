package com.dojo.stage.domain;

public class SaisieTransformation {

    private Long id;
    private String collaborateurUid;
    private String domaine;
    private String equipe;
    private String profil;
    private String competences;

    public SaisieTransformation(Long id, String collaborateurUid, String domaine, String equipe, String profil, String competences) {
        this.id = id;
        this.collaborateurUid = collaborateurUid;
        this.domaine = domaine;
        this.equipe = equipe;
        this.profil = profil;
        this.competences = competences;
    }

    public Long getId() {
        return id;
    }

    public String getCollaborateurUid() {
        return this.collaborateurUid;
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

    public void update (SaisieTransformation saisieTransformationForUpdate, Long id) {
        this.id = id;
        this.collaborateurUid = saisieTransformationForUpdate.collaborateurUid;
        this.domaine = saisieTransformationForUpdate.domaine;
        this.equipe = saisieTransformationForUpdate.equipe;
        this.profil = saisieTransformationForUpdate.profil;
        this.competences = saisieTransformationForUpdate.competences;
    }

}
