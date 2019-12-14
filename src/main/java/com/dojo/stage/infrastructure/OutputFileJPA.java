package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.OutputFile;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "OUTPUT_FILE")
public class OutputFileJPA {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id;

    @Embedded
    private OutputFile outputFile;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public OutputFileJPA(){}

    public OutputFileJPA(OutputFile outputFile) {
        this.outputFile = outputFile;
    }

    public OutputFile toOutputFile(){
        return new OutputFile( id.toString(), this.outputFile.getNom(), this.outputFile.getPrenom(), this.outputFile.getEmail(), this.outputFile.getDomaine(),this.outputFile.getEquipe(),this.outputFile.getProfil(), this.outputFile.getCompetences());
    }
}
