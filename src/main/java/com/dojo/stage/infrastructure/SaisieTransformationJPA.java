package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.SaisieTransformation;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "SAISIE")
public class SaisieTransformationJPA {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String collaborateurUid;
    @Column
    private String domaine;
    @Column
    private String equipe;
    @Column
    private String profil;
    @Column
    private String competences;
    @CreationTimestamp
    private LocalDateTime createDateTime;
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public SaisieTransformationJPA() {
    }

    public SaisieTransformationJPA(SaisieTransformation saisie) {
        this.id = saisie.getId();
        this.collaborateurUid = saisie.getCollaborateurUid();
        this.domaine = saisie.getDomaine();
        this.equipe = saisie.getEquipe();
        this.profil = saisie.getProfil();
        this.competences = saisie.getCompetences();
    }

    public SaisieTransformation toSaisieTransformation() {
        return new SaisieTransformation(
                this.id,
                this.collaborateurUid,
                this.domaine,
                this.equipe,
                this.profil,
                this.competences
        );
    }
}
