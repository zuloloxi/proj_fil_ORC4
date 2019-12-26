package com.dojo.stage.exposition;

import com.dojo.stage.domain.Output;

import java.util.List;
import java.util.stream.Collectors;

public final class OutputMapper {

    private OutputMapper() {}

    static Output mapToOutput(OutputDTO outputDTO) {
        return new Output(outputDTO.identifiant, outputDTO.nom, outputDTO.prenom, outputDTO.email, outputDTO.domaine,
                outputDTO.equipe, outputDTO.profil, outputDTO.competences);
    }

    static List<Output> mapToListOutputs(List<OutputDTO> listOutputDTO) {
        return listOutputDTO.stream().map(OutputMapper::mapToOutputFile).collect(Collectors.toList());
    }

    public static List<OutputDTO> adaptToOutputFileDTOList(List<Output> outputs) {
        return outputs.stream().map(OutputMapper::mapToOutputFileDTO).collect(Collectors.toList());
    }

    static OutputDTO mapToOutputFileDTO(Output output) {
        return new OutputDTO(
                output.getIdentifiant(),
                output.getNom(),
                output.getPrenom(),
                output.getEmail(),
                output.getDomaine(),
                output.getEquipe(),
                output.getProfil(),
                output.getCompetences()
        );
    }

    private static Output mapToOutputFile(OutputDTO outputDTO) {
        return new Output(
                outputDTO.identifiant,
                outputDTO.nom,
                outputDTO.prenom,
                outputDTO.email,
                outputDTO.domaine,
                outputDTO.equipe,
                outputDTO.profil,
                outputDTO.competences
        );
    }

}
