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
    private String decriptif;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public CompetenceJPA() {
    };

    public CompetenceJPA(Competence competence) {
        this.competence = competence.getCompetence();
        this.decriptif = competence.getCompetence();
    }

    public Long getId() {
        return id;
    }

    public String getCompetence() {
        return competence;
    }

    public String getDecriptif() {
        return decriptif;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }
}
