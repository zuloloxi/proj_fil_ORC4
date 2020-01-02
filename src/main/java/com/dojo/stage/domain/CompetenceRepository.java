package com.dojo.stage.domain;

import java.util.List;

public interface CompetenceRepository {
    List<Competence> findAll();
    List<Competence> findByCompetence(String posteType);
    void delete(Long id);
    Competence save(Competence competence);
    Competence findById (Long id);
}

