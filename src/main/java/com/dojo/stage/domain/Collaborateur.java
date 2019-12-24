package com.dojo.stage.domain;


public class Collaborateur {

    private String uid;
    private String civilite;
    private String nom;
    private String prenom;
    private String fonction;
    private String telephone;
    private String mail;
    private String etage;
    private String uoAffectation;
    private String codeImmeubleEmplacementCollaborateur;
    private String region;
    private String codeRegion;
    private String niveauTerritoire;
    private String codeTerritoire;
    private String niveauEntite;
    private String codeEntite;
    private String niveauAgence;
    private String codeAgence;
    private String localisationCollaborateur;
    private String pj;
    private String aMigrer;

    public Collaborateur (){}

    public Collaborateur(String uid, String civilite, String nom, String prenom, String fonction, String telephone, String mail, String etage, String uoAffectation, String codeImmeubleEmplacementCollaborateur, String region, String codeRegion, String niveauTerritoire, String codeTerritoire, String niveauEntite, String codeEntite, String niveauAgence, String codeAgence, String localisationCollaborateur, String pj, String aMigrer) {
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

    public String getUid() {
        return uid;
    }

    public String getCivilite() {
        return civilite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMail() {
        return mail;
    }

    public String getEtage() {
        return etage;
    }

    public String getUoAffectation() {
        return uoAffectation;
    }

    public String getCodeImmeubleEmplacementCollaborateur() {
        return codeImmeubleEmplacementCollaborateur;
    }

    public String getRegion() {
        return region;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public String getNiveauTerritoire() {
        return niveauTerritoire;
    }

    public String getCodeTerritoire() {
        return codeTerritoire;
    }

    public String getNiveauEntite() {
        return niveauEntite;
    }

    public String getCodeEntite() {
        return codeEntite;
    }

    public String getNiveauAgence() {
        return niveauAgence;
    }

    public String getCodeAgence() {
        return codeAgence;
    }

    public String getLocalisationCollaborateur() {
        return localisationCollaborateur;
    }

    public String getPj() {
        return pj;
    }

    public String getaMigrer() {
        return aMigrer;
    }

    public OutputFile toOutputFile (Regle regle) {
    //    Regle regle = regleRepository.findByPosteType(this.fonction);
        return  new OutputFile(this.uid, this.nom, this.prenom,this.mail,regle.getDomaine(), "ACODER", "ACODER","ACODER");
    }
}
