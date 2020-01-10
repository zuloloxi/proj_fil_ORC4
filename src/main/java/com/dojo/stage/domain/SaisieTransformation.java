package com.dojo.stage.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaisieTransformation)) return false;
        SaisieTransformation that = (SaisieTransformation) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(collaborateurUid, that.collaborateurUid) &&
                Objects.equals(domaine, that.domaine) &&
                Objects.equals(equipe, that.equipe) &&
                Objects.equals(profil, that.profil) &&
                Objects.equals(competences, that.competences);
    }

}
