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
}
