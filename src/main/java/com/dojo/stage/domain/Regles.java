package com.dojo.stage.domain;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Regles {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String deploiement;
    @Column
    private String metier;
    @Column
    private String posteType;
    @Column
    private String domaine;
    @Column
    private String stratesEquipes;
    @Column
    private String profil;
    @Column
    private String equipesSupervisees;
    @Column
    private String descriptifEquipesSupervisses;
    @OneToMany (cascade=CascadeType.ALL)
    @JoinColumn(name="regles_id")
    private Set<Competence> competences;

    public Regles() {
    };

    public Regles(Long id, String deploiement, String metier, String posteType, String domaine, String stratesEquipes, String profil, String equipesSupervisees, String descriptifEquipesSupervisses, Set<Competence> competences) {
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

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeploiement() {
        return deploiement;
    }

    public void setDeploiement(String deploiement) {
        this.deploiement = deploiement;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public String getPosteType() {
        return posteType;
    }

    public void setPosteType(String posteType) {
        this.posteType = posteType;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getStratesEquipes() {
        return stratesEquipes;
    }

    public void setStratesEquipes(String stratesEquipes) {
        this.stratesEquipes = stratesEquipes;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getEquipesSupervisees() {
        return equipesSupervisees;
    }

    public void setEquipesSupervisees(String equipesSupervisees) {
        this.equipesSupervisees = equipesSupervisees;
    }

    public String getDescriptifEquipesSupervisses() {
        return descriptifEquipesSupervisses;
    }

    public void setDescriptifEquipesSupervisses(String descriptifEquipesSupervisses) {
        this.descriptifEquipesSupervisses = descriptifEquipesSupervisses;
    }

    public Set<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(Set<Competence> competences) {
        this.competences = competences;
    }

    @Override
    public String toString() {
        return "Regles{" +
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
