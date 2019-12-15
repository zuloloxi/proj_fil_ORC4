package com.dojo.stage.exposition;

import com.dojo.stage.domain.OutputFile;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public final class OutputAdapter {

    private OutputAdapter() {}

    static OutputFile transformToOutputFile(OutputFileDTO outputFileDTO) {
        return new OutputFile(outputFileDTO.identifiant, outputFileDTO.nom, outputFileDTO.prenom, outputFileDTO.email, outputFileDTO.domaine,
                outputFileDTO.equipe, outputFileDTO.profil, outputFileDTO.competences);
    }

    public static List<OutputFileDTO> adaptToLibraryDTOList(List<OutputFile> outputFiles) {
        return outputFiles.stream().map(OutputAdapter::adaptToLibraryDTO).collect(Collectors.toList());
    }

    private static OutputFileDTO adaptToLibraryDTO(OutputFile outputFile) {
        return new OutputFileDTO(
                outputFile.getIdentifiant(),
                outputFile.getNom(),
                outputFile.getPrenom(),
                outputFile.getEmail(),
                outputFile.getDomaine(),
                outputFile.getEquipe(),
                outputFile.getProfil(),
                outputFile.getCompetences()
        );
    }
}
