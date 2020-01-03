package com.dojo.stage.application;

import com.dojo.stage.domain.Competence;
import com.dojo.stage.domain.CompetenceRepository;
import com.dojo.stage.domain.RegleRepository;
import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException400;
import com.dojo.stage.domain.exception.MyProjectException404;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class CompetenceService {
    @Autowired
    private CompetenceRepository competenceRepository;

    @Autowired
    private RegleRepository regleRepository;

    public List<Competence> getAll() {
        return this.competenceRepository.findAll();
    }

    public Competence getById(Long id) {
        return this.competenceRepository.findById(id);
    }

    public Competence create(Competence competence) {
        if (competenceRepository.findByCompetence(competence.getCompetence()).isEmpty()) {
            return this.competenceRepository.save(competence);
        } else {
            throw new MyProjectException400(ErrorCodes.COMPETENCE_ALREADY_EXISTS);
        }
    }

    public void delete (Long id) {
        if (regleRepository.findByCompetenceId(id).isEmpty()) {
            deleteCompetence(id);
        }else{
            throw new MyProjectException400(ErrorCodes.COMPETENCE_IS_STILL_USED);
        }
    }

    private void deleteCompetence(Long id) {
        try {
            competenceRepository.delete(id);
        }
        catch(EmptyResultDataAccessException e){
            throw new MyProjectException404(ErrorCodes.COMPETENCE_NOT_FOUND);
        }
    }

    public Competence update(Competence competenceForUpdate, Long id) {
        Competence competence = getById(id);
        competence.update(competenceForUpdate);
        return competenceRepository.save(competence);
    }

}
