package com.dojo.stage.application;

import com.dojo.stage.domain.Competence;
import com.dojo.stage.domain.CompetenceRepository;
import com.dojo.stage.domain.Regle;
import com.dojo.stage.domain.RegleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class CompetenceService {
    @Autowired
    private CompetenceRepository competenceRepository;

    public List<Competence> getAll() {
        return this.competenceRepository.findAll();
    }

    public Competence getById(Long id) {
        return this.competenceRepository.findById(id);
    }

    public Competence create(Competence competence) {
        return this.competenceRepository.save(competence);
    }

    public void delete (Long id) {
        competenceRepository.delete(id);
    }

    public Competence update(Competence competenceForUpdate, Long id) {
        Competence competence = getById(id);
        competence.update(competenceForUpdate);
        return competenceRepository.save(competence);
    }

}
