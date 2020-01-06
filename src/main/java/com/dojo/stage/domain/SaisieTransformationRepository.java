package com.dojo.stage.domain;

import java.util.List;

public interface SaisieTransformationRepository {
    List<SaisieTransformation> findAll();
    void delete(Long id);
    SaisieTransformation save(SaisieTransformation saisieTransformation);
    SaisieTransformation findById (Long id);
    List<SaisieTransformation> findByCollaborateurId (Long id);
}
