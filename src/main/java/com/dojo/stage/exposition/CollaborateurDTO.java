package com.dojo.stage.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollaborateurDTO {

    @JsonProperty
    public String uid;

    @JsonProperty
    public String civilite;

    @JsonProperty
    public String nom;

    @JsonProperty
    public String prenom;

    @JsonProperty
    public String fonction;

    @JsonProperty
    public String telephone;

    @JsonProperty
    public String mail;

    @JsonProperty
    public String etage;

    @JsonProperty
    public String uoAffectation;

    @JsonProperty
    public String codeImmeubleEmplacementCollaborateur;

    @JsonProperty
    public String region;

    @JsonProperty
    public String codeRegion;

    @JsonProperty
    public String niveauTerritoire;

    @JsonProperty
    public String codeTerritoire;

    @JsonProperty
    public String niveauEntite;

    @JsonProperty
    public String codeEntite;

    @JsonProperty
    public String niveauAgence;

    @JsonProperty
    public String codeAgence;

    @JsonProperty
    public String localisationCollaborateur;

    @JsonProperty
    public String pj;

    @JsonProperty
    public String aMigrer;

    public CollaborateurDTO (){}

    public CollaborateurDTO (String uid, String civilite, String nom, String prenom, String fonction, String telephone, String mail, String etage, String uoAffectation, String codeImmeubleEmplacementCollaborateur, String region, String codeRegion, String niveauTerritoire, String codeTerritoire, String niveauEntite, String codeEntite, String niveauAgence, String codeAgence, String localisationCollaborateur, String pj, String aMigrer) {
        this.uid = uid;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.telephone = telephone;
        this.mail = mail;
        this.etage = etage;
        this.uoAffectation = uoAffectation;
        this.codeImmeubleEmplacementCollaborateur = codeImmeubleEmplacementCollaborateur;
        this.region = region;
        this.codeRegion = codeRegion;
        this.niveauTerritoire = niveauTerritoire;
        this.codeTerritoire = codeTerritoire;
        this.niveauEntite = niveauEntite;
        this.codeEntite = codeEntite;
        this.niveauAgence = niveauAgence;
        this.codeAgence = codeAgence;
        this.localisationCollaborateur = localisationCollaborateur;
        this.pj = pj;
        this.aMigrer = aMigrer;
    }


}
