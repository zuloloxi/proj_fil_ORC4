package com.dojo.stage.domain;

import java.util.List;

public interface RegleRepository {
    List<Regle> findAll();
    Regle findByPosteType(String posteType);
    void delete(Long id);
    Regle save(Regle regle);
    Regle findById (Long id);
}
