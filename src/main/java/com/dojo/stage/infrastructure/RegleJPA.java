package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Competence;
import com.dojo.stage.domain.Regle;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="regle_id")
    private Set<CompetenceJPA> competences;
    @CreationTimestamp
    private LocalDateTime createDateTime;
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public RegleJPA() {
    }

    public RegleJPA(Regle regle) {
        this.deploiement = regle.getDeploiement();
        this.metier = regle.getMetier();
        this.posteType = regle.getDomaine();
        this.domaine = regle.getDomaine();
        this.stratesEquipes = regle.getStratesEquipes();
        this.profil = regle.getProfil();
        this.equipesSupervisees = regle.getEquipesSupervisees();
        this.descriptifEquipesSupervisses = regle.getDescriptifEquipesSupervisses();
        this.competences = regle.getCompetences().stream().map(CompetenceJPA::new).collect(Collectors.toSet());
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
}