package com.dojo.stage.infrastructure;

import com.dojo.stage.application.OutputService;
import com.dojo.stage.domain.OutputFile;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "OUTPUT_FILE")
public class OutputFileJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Embedded
    private OutputFile outputFile;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public OutputFileJPA(){}

    OutputFileJPA(OutputFile outputFile) {
//        this.id = getId();
        this.outputFile = outputFile;
    }

    Long getId() {
        return id;
    }

    OutputFile toOutputFile(){
        return new OutputFile(
                this.outputFile.getIdentifiant(),
                this.outputFile.getNom(),
                this.outputFile.getPrenom(),
                this.outputFile.getEmail(),
                this.outputFile.getDomaine(),
                this.outputFile.getEquipe(),
                this.outputFile.getProfil(),
                this.outputFile.getCompetences()
        );
    }
}
