package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Collaborateur;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "COLLABORATEUR")
public class CollaborateurJPA {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id;

    @Embedded
    private Collaborateur collaborateur;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public CollaborateurJPA(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
