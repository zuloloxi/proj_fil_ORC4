package com.dojo.stage.domain;

import javax.persistence.*;
import java.util.Set;

public class Regle {

    private String deploiement;

    private String metier;

    private String posteType;

    private String domaine;

    private String stratesEquipes;

    private String profil;

    private String equipesSupervisees;

    private String descriptifEquipesSupervisses;

    private Set<Competence> competences;

    public Regle(String deploiement, String metier, String posteType, String domaine, String stratesEquipes, String profil, String equipesSupervisees, String descriptifEquipesSupervisses, Set<Competence> competences) {
        this.deploiement = deploiement;
        this.metier = metier;
        this.posteType = posteType;
        this.domaine = domaine;
        this.stratesEquipes = stratesEquipes;
        this.profil = profil;
        this.equipesSupervisees = equipesSupervisees;
        this.descriptifEquipesSupervisses = descriptifEquipesSupervisses;
        this.competences = competences;
    }

    public String getDeploiement() {
        return deploiement;
    }

    public String getMetier() {
        return metier;
    }

    public String getPosteType() {
        return posteType;
    }

    public String getDomaine() {
        return domaine;
    }

    public String getStratesEquipes() {
        return stratesEquipes;
    }

    public String getProfil() {
        return profil;
    }

    public String getEquipesSupervisees() {
        return equipesSupervisees;
    }

    public String getDescriptifEquipesSupervisses() {
        return descriptifEquipesSupervisses;
    }

    public Set<Competence> getCompetences() {
        return competences;
    }


}
