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

    public OutputFileJPA(OutputFile outputFile) {
        this.outputFile = outputFile;
    }
}
