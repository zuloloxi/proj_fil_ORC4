package com.dojo.stage.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OutputDTO {
//    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
//    String id;

    @JsonProperty
    String identifiant;

    @JsonProperty
    String nom;

    @JsonProperty
    String prenom;

    @JsonProperty
    String email;

    @JsonProperty
    String domaine;

    @JsonProperty
    String equipe;

    @JsonProperty
    String profil;

    @JsonProperty
    String competences;

    public OutputDTO() {}

    OutputDTO(String identifiant, String nom, String prenom, String email, String domaine,
              String equipe, String profil, String competences) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.domaine = domaine;
        this.equipe = equipe;
        this.profil = profil;
        this.competences = competences;
    }
}