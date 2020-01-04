package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Output;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "OUTPUT_FILE")
public class OutputFileJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Embedded
    private Output output;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public OutputFileJPA(){}

    OutputFileJPA(Output output) {
        this.output = output;
    }

    // constructeur pour l'update
    OutputFileJPA(Output output, Long id) {
        this.id = id;
        this.output = output;
    }

    Long getId() {
        return this.id;
    }

    Output toOutputFile(){
        return new Output(
                this.output.getIdentifiant(),
                this.output.getNom(),
                this.output.getPrenom(),
                this.output.getEmail(),
                this.output.getDomaine(),
                this.output.getEquipe(),
                this.output.getProfil(),
                this.output.getCompetences()
        );
    }

    Output toOutput(){
        return new Output(
                this.output.getAction(),
                this.output.getIdentifiant(),
                this.output.getNom(),
                this.output.getPrenom(),
                this.output.getEmail(),
                this.output.getEmailCommerciale(),
                this.output.getLangue(),
                this.output.getDomaine(),
                this.output.getEquipe(),
                this.output.getGroupeCompetence(),
                this.output.getGroupesReporting(),
                this.output.getProfil(),
                this.output.getAdministration(),
                this.output.getSupervision(),
                this.output.getAgent(),
                this.output.getStatistiques(),
                this.output.getEnregistrement(),
                this.output.getCampagnes(),
                this.output.getScripting(),
                this.output.getHistorique(),
                this.output.getSuiviActions(),
                this.output.getSuiviAppels(),
                this.output.getConfigurationAfficheursMuraux(),
                this.output.getHypervision(),
                this.output.getCompetences(),
                this.output.getSite(),
                this.output.getPositionPrivee(),
                this.output.getPositionCommerciale(),
                this.output.getMobile(),
                this.output.getDomainesSupervises(),
                this.output.getEquipesSupervisees(),
                this.output.getFluxSupervises(),
                this.output.getCompetencesSupervisees(),
                this.output.getGroupesSupervises(),
                this.output.getSitesSupervises(),
                this.output.getCanauxExternes(),
                this.output.getPausesSupervisees(),
                this.output.getTachesSupervisees(),
                this.output.getCompteursSupervises(),
                this.output.getServicesSupervises(),
                this.output.getAlertesSeuilSupervisees(),
                this.output.getCategoriesAlertes(),
                this.output.getModelesAlertes(),
                this.output.getPanneauxSupervises(),
                this.output.getMissionsSupervisees(),
                this.output.getAnnuairesSupervises(),
                this.output.getStrategiesRoutageSupervisees(),
                this.output.getProfilsSupervises(),
                this.output.getPlanningsSupervises(),
                this.output.getCommentaires()
        );
    }
}
