package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Competence;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "COMPETENCE")
public class CompetenceJPA {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String competence;
    @Column
    private String descriptif;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public CompetenceJPA() {
    }

    public CompetenceJPA(Competence competence) {
        this.id = competence.getId();
        this.competence = competence.getCompetence();
        this.descriptif = competence.getCompetence();
    }

    public CompetenceJPA(Long id, Competence competence) {
        this.id = id;
        this.competence = competence.getCompetence();
        this.descriptif = competence.getCompetence();
    }

    public Long getId() {
        return id;
    }

    public String getCompetence() {
        return competence;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public Competence toCompetence() {
        return new Competence(
                this.id,
                this.competence,
                this.descriptif
        );
    }
}
