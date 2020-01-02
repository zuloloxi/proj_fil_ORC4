package com.dojo.stage.application;

import com.dojo.stage.domain.Competence;
import com.dojo.stage.domain.CompetenceRepository;
import com.dojo.stage.domain.Regle;
import com.dojo.stage.domain.RegleRepository;
import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.dojo.stage.domain.exception.ErrorCodes.COMPETENCE_NOT_FOUND;

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
        // ????????????????? pas terrible comme fonctionnement !!!!!!!!!!!!!!!!!!!
        // produit forcément une exception dans le cas passant : à checker
        if (competenceRepository.findByCompetence(competence.getCompetence()).isEmpty()) {
            return this.competenceRepository.save(competence);
        } else {
            throw new MyProjectException(ErrorCodes.COMPETENCE_ALREADY_EXISTS);
        }
    }

    public void delete (Long id) {
        if (regleRepository.findByCompetenceId(id).isEmpty()) {
            competenceRepository.delete(id);
        }else{
            throw new MyProjectException(ErrorCodes.COMPETENCE_IS_STILL_USED);
        }
    }

    public Competence update(Competence competenceForUpdate, Long id) {
        Competence competence = getById(id);
        competence.update(competenceForUpdate);
        return competenceRepository.save(competence);
    }

}
