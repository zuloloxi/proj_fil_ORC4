package com.dojo.stage.application;

import com.dojo.stage.domain.Competence;
import com.dojo.stage.domain.Regle;
import com.dojo.stage.domain.RegleRepository;
import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException404;
import com.dojo.stage.domain.exception.MyProjectException500;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional

public class RegleService {
    @Autowired
    private RegleRepository regleRepository;

    @Autowired
    private CompetenceService competenceService;

    public List<Regle> getAll() {
        return this.regleRepository.findAll();
    }

    public Regle getRegleByPosteType (String posteType) {
        return this.regleRepository.findByPosteType(posteType);
    }

    public List<Regle> getRegleByCompetenceId (Long competenceId) {
        return this.regleRepository.findByCompetenceId(competenceId);
    }

    public Regle getById(Long id) {
        return this.regleRepository.findById(id);
    }

    public Regle create(Regle regle) {
        regle.setCompetences(searchCompetences(regle.getCompetences()));
        return this.regleRepository.save(regle);
    }

    public void delete (Long id) {
        try {
            regleRepository.delete(id);
        }
        catch(EmptyResultDataAccessException e){
            throw new MyProjectException404(ErrorCodes.REGLE_NOT_FOUND);
        }
    }

    public Regle update(Regle regleForUpdate, Long id) {
        Regle regle = getById(id);
        regle.update(regleForUpdate);
        return regleRepository.save(regle);
    }


    private Set<Competence> searchCompetences(Set<Competence> competences) {
        Set<Competence> result = new HashSet<>();
        for (Competence competence: competences) {
            Competence competenceToVerify = competenceService.getById(competence.getId());
            if (competenceToVerify.getCompetence().equals(competence.getCompetence())){
                result.add(competenceToVerify);
            }else{
                throw new MyProjectException500(ErrorCodes.COMPETENCE_HAS_CHANGED);
            }
        }
        return result;
    }

}
