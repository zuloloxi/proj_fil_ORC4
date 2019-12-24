package com.dojo.stage.exposition;

import com.dojo.stage.domain.Collaborateur;

import java.util.List;
import java.util.stream.Collectors;

public class CollaborateurMapper {

    public CollaborateurMapper(){}

    public static Collaborateur mapToCollaborateur (CollaborateurDTO collaborateurDTO) {
        return new Collaborateur(collaborateurDTO.uid, collaborateurDTO.civilite, collaborateurDTO.nom,
                collaborateurDTO.prenom, collaborateurDTO.fonction, collaborateurDTO.telephone,
                collaborateurDTO.mail,collaborateurDTO.etage,collaborateurDTO.uoAffectation, collaborateurDTO.codeImmeubleEmplacementCollaborateur,
                collaborateurDTO.region, collaborateurDTO.codeRegion, collaborateurDTO.niveauTerritoire,
                collaborateurDTO.codeTerritoire,collaborateurDTO.niveauEntite,collaborateurDTO.codeEntite,
                collaborateurDTO.niveauAgence,collaborateurDTO.codeAgence,collaborateurDTO.localisationCollaborateur,
                collaborateurDTO.pj,collaborateurDTO.aMigrer);
    }

    public static CollaborateurDTO mapToCollaborateurDTO (Collaborateur collaborateur) {
        return new CollaborateurDTO(collaborateur.getUid(),collaborateur.getCivilite(),collaborateur.getNom(),
                collaborateur.getPrenom(),collaborateur.getFonction(),collaborateur.getTelephone(),
                collaborateur.getMail(),collaborateur.getEtage(),collaborateur.getUoAffectation(),
                collaborateur.getCodeImmeubleEmplacementCollaborateur(),collaborateur.getRegion(),
                collaborateur.getCodeRegion(),collaborateur.getNiveauTerritoire(),
                collaborateur.getCodeTerritoire(),collaborateur.getNiveauEntite(),collaborateur.getCodeEntite(),
                collaborateur.getNiveauAgence(),collaborateur.getCodeAgence(),collaborateur.getLocalisationCollaborateur(),
                collaborateur.getPj(),collaborateur.getaMigrer());
    }

    public static List<CollaborateurDTO> mapToCollaborateurDTOList(List<Collaborateur> collaborateurs) {
        return collaborateurs.stream().map(CollaborateurMapper::mapToCollaborateurDTO).collect(Collectors.toList());
    }

}
