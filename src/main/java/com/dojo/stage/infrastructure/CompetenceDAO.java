package com.dojo.stage.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompetenceDAO extends JpaRepository<CompetenceJPA, Long> {
    List<CompetenceJPA> findAllByOrderById ();
    List<CompetenceJPA> findByCompetenceOrderById (String competence);
}
