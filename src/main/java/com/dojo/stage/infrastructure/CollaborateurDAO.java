package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CollaborateurDAO extends JpaRepository<CollaborateurJPA, Long> {

    @Query(value = "SELECT * FROM collaborateur WHERE uid = :uid", nativeQuery = true)
    CollaborateurJPA findByUid(String uid);

    @Modifying
    @Query(value = "DELETE FROM collaborateur WHERE uid = :uid", nativeQuery = true)
    void deleteByUid(String uid);

    @Modifying
    @Query(value = "UPDATE collaborateur SET  civilite = :civilite, nom = :nom, prenom = :prenom, fonction = :fonction, telephone = :telephone, mail = :mail, etage = :etage, uo_affectation = :uoAffectation, code_immeuble_emplacement_collaborateur = :codeImmeubleEmplacementCollaborateur,region = :region,code_region = :codeRegion, niveau_territoire = :niveauTerritoire, code_territoire = :codeTerritoire, niveau_entite = :niveauEntite, code_entite = :codeEntite, niveau_agence = :niveauAgence, code_agence = :codeAgence, localisation_collaborateur = :localisationCollaborateur, pj = :pj, a_migrer = :aMigrer\n" +
            "    WHERE uid = :uid", nativeQuery = true)
    void updateByUid(String uid, String civilite, String nom, String prenom, String fonction, String telephone, String mail, String etage, String uoAffectation, String codeImmeubleEmplacementCollaborateur, String region, String codeRegion, String niveauTerritoire, String codeTerritoire, String niveauEntite, String codeEntite, String niveauAgence, String codeAgence, String localisationCollaborateur, String pj, String aMigrer
    );

}