package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Competence;
import com.dojo.stage.domain.Regle;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity(name = "REGLE")
public class RegleJPA {
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
//    @OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name="regle_id")
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name="regle_has_competences",
            joinColumns = @JoinColumn(name = "regle_id"),
            inverseJoinColumns = @JoinColumn(name = "competence_id")
    )
    private Set<CompetenceJPA> competences;
    @CreationTimestamp
    private LocalDateTime createDateTime;
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public RegleJPA() {
    }

    RegleJPA(Regle regle) {
        this.id = regle.getId();
        this.deploiement = regle.getDeploiement();
        this.metier = regle.getMetier();
        this.posteType = regle.getPosteType();
        this.domaine = regle.getDomaine();
        this.stratesEquipes = regle.getStratesEquipes();
        this.profil = regle.getProfil();
        this.equipesSupervisees = regle.getEquipesSupervisees();
        this.descriptifEquipesSupervisses = regle.getDescriptifEquipesSupervisses();
        this.competences = searchCompetence(regle.getCompetences());
        this.competences = regle.getCompetences().stream().map(CompetenceJPA::new).collect(Collectors.toSet());
    }

    private Set<CompetenceJPA> searchCompetence(Set<Competence> competences) {
        Set<CompetenceJPA> competencesJPA = new HashSet<>();
//        CompetenceJPA toot =
//        à adapter
        for (Competence competence : competences) {
            competencesJPA.add(new CompetenceJPA(2L, competence));
        }
        return competencesJPA;
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

    public Set<CompetenceJPA> getCompetences() {
        return competences;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    Regle toRegle(){
        return new Regle(
                this.id,
                this.deploiement,
                this.metier,
                this.posteType,
                this.domaine,
                this.stratesEquipes,
                this.profil,
                this.equipesSupervisees,
                this.descriptifEquipesSupervisses,
                this.competences.stream().map(competenceJPA->new Competence(competenceJPA.getId(),competenceJPA.getCompetence(),competenceJPA.getDescriptif()))
                        .collect(Collectors.toSet())
        );}

    @Override
    public String toString() {
        return "RegleJPA{" +
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
                ", createDateTime=" + createDateTime +
                ", updateDateTime=" + updateDateTime +
                '}';
    }
}
