package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Collaborateur;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "COLLABORATEUR")
public class CollaborateurJPA {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Embedded
    private Collaborateur collaborateur;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;


    public CollaborateurJPA() {}

    public CollaborateurJPA(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    Long getId() {return id;}

    public Collaborateur toCollaborateur(){
        return new Collaborateur(this.collaborateur.getUid(), this.collaborateur.getCivilite(),this.collaborateur.getNom(),
         this.collaborateur.getPrenom(),this.collaborateur.getFonction(),this.collaborateur.getTelephone(),
         this.collaborateur.getMail(),this.collaborateur.getEtage(),this.collaborateur.getUoAffectation(),
         this.collaborateur.getCodeImmeubleEmplacementCollaborateur(),this.collaborateur.getRegion(),
         this.collaborateur.getCodeRegion(),this.collaborateur.getNiveauTerritoire(),this.collaborateur.getCodeTerritoire(),
         this.collaborateur.getNiveauEntite(),this.collaborateur.getCodeEntite(),
         this.collaborateur.getNiveauAgence(),this.collaborateur.getCodeAgence(),
         this.collaborateur.getLocalisationCollaborateur(),this.collaborateur.getPj(),this.collaborateur.getaMigrer());
    }
}
