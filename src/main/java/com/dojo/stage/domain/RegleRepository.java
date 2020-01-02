package com.dojo.stage.domain;

import java.util.List;

public interface RegleRepository {
    List<Regle> findAll();
    Regle findByPosteType(String posteType);
    Regle findByPosteTypeSTP(String posteType); // Straight-through processing
    void delete(Long id);
    Regle save(Regle regle);
    Regle findById (Long id);
    List<Regle> findByCompetenceId(Long id);
}
