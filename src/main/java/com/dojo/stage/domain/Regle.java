package com.dojo.stage.domain;


import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException500;
import org.springframework.util.StringUtils;

import javax.validation.constraints.Null;
import java.util.*;
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

    public Regle(){};
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
        validate();

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
        return domaine == null ? "":domaine;
    }

    public String getStratesEquipes() {
        return stratesEquipes == null ? "":stratesEquipes;
    }

    public String getProfil() { return profil == null ? "":profil; }

    public String getEquipesSupervisees() {
        return equipesSupervisees;
    }

    public String getDescriptifEquipesSupervisses() {
        return descriptifEquipesSupervisses;
    }

    public Set<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(Set<Competence> competences) {
        this.competences = competences;
    }

    private void validate() {
        Set<String> errors = new HashSet<>();
        if (StringUtils.isEmpty(this.domaine)) {
           errors.add(ErrorCodes.DOMAINE_IS_EMPTY);
            System.out.println( errors);
        }
        if (StringUtils.isEmpty(this.posteType)) {
            errors.add(ErrorCodes.POSTE_TYPE_IS_EMPTY);
            System.out.println( errors);
        }

        if(!errors.isEmpty()) {
            throw new MyProjectException500(errors);
        }
    }

    String buildCompetences(){
        return this.getCompetences().isEmpty() ? "ERREUR 007 : NO SKILLS MATCHES":this.getCompetences()
                .stream()
                .map(x -> x.getCompetence() + "|1|1|PHONE|INCOMING")
                .collect(Collectors.joining(","));
    }

    String buildProfil(String getNiveauEntite){
        if (getNiveauEntite.isEmpty()) {
            return "ERREUR 003 : NIVEAU ENTITE NON RENSEIGNE";
        }
        if (getProfil().isEmpty()) {
            return "ERREUR 002 : PROFIL NON RENSEIGNE";
        }
        List<String> liste = Arrays.asList(this.getProfil().split("(\\(X\\))"));
        return  liste.size() > 1 ? liste.get(0) + "(" + getNiveauEntite + ")" : getProfil() ;
    }

    String buildTeam(String getNiveauEntite, String getCodeAgence){
        if (getNiveauEntite.isEmpty()){
            return "ERREUR 003 : NIVEAU ENTITE NON RENSEIGNE";
        }
        if (getCodeAgence.isEmpty()){
            return "ERREUR 004 : CODE AGENCE NON RENSEIGNE";
        }
        if (getStratesEquipes().isEmpty() || getStratesEquipes() == null || getStratesEquipes().equals("")){
            return "ERREUR 005 : STRATES EQUIPE NON RENSEIGNEES";
        }
        List<String> liste = Arrays.asList(this.getStratesEquipes().split("\\+?\\[UO format XXXXX\\]"));
        String teamNumber =  Character.isDigit(getNiveauEntite.charAt(getNiveauEntite.length()-1)) ? String.valueOf(getNiveauEntite.charAt(getNiveauEntite.length()-1)) :"";
        return  liste.size() > 1 ? teamNumber.isEmpty() ? "ERREUR 006 : NUMERO EQUIPE NON RENSEIGNE":liste.get(0) + getCodeAgence.substring(0,5) + "Eq" + teamNumber : liste.get(0) + getCodeAgence.substring(0,5);
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
