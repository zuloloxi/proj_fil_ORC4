package com.dojo.stage.domain;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Regle {

    private Long id;

    private String deploiement;

    private String metier;

    private String posteType;

    private String domaine;

    private String stratesEquipes;

    private String profil;

    private String equipesSupervisees;

    private String descriptifEquipesSupervisses;

    private Set<Competence> competences;


    public Regle(Long id, String deploiement, String metier, String posteType, String domaine, String stratesEquipes, String profil, String equipesSupervisees, String descriptifEquipesSupervisses, Set<Competence> competences) {
        this.id = id;
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

    public Long getId() {
        return id;
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

    String buildCompetences(){
        return this.getCompetences()
                .stream()
                .map(x -> x.getCompetence() + "|1|1|PHONE|INCOMING")
                .collect(Collectors.joining(","));
    }

    String buildProfil(String getNiveauTerritoire){
        List<String> liste = Arrays.asList(this.getProfil().split("(\\(X\\))"));
        return  liste.size() > 1 ? liste.get(0) + "(" + getNiveauTerritoire + ")" :getProfil() ;
    }

    public void update (Regle regleForUpdate) {
        this.deploiement = regleForUpdate.deploiement;
        this.metier = regleForUpdate.metier;
        this.posteType= regleForUpdate.posteType;
        this.domaine = regleForUpdate.domaine;
        this.stratesEquipes = regleForUpdate.stratesEquipes;
        this.profil = regleForUpdate.profil;
        this.equipesSupervisees = regleForUpdate.equipesSupervisees;
        this.descriptifEquipesSupervisses = regleForUpdate.descriptifEquipesSupervisses;
        this.competences = regleForUpdate.competences;
    }

    @Override
    public String toString() {
        return "Regle{" +
                "id=" + id +
                ", deploiement='" + deploiement + '\'' +
                ", metier='" + metier + '\'' +
                ", posteType='" + posteType + '\'' +
                ", domaine='" + domaine + '\'' +
                ", stratesEquipes='" + stratesEquipes + '\'' +
                ", profil='" + profil + '\'' +
                ", equipesSupervisees='" + equipesSupervisees + '\'' +
                ", descriptifEquipesSupervisses='" + descriptifEquipesSupervisses + '\'' +
                ", competences=" + competences +
                '}';
    }
}
