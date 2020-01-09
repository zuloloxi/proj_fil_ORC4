package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Competence;
import com.dojo.stage.domain.CompetenceRepository;
import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException404;
import com.dojo.stage.domain.exception.MyProjectException500;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CompetenceRepositoryImpl implements CompetenceRepository {

    @Autowired
    private CompetenceDAO competenceDAO;

    @Override
    public List<Competence> findAll() {
        return competenceDAO.findAllByOrderById().stream().map(CompetenceJPA::toCompetence).collect(Collectors.toList());
    }

    @Override
    public List<Competence> findByCompetence(String competenceCode) {
        return competenceDAO.findByCompetenceOrderById(competenceCode).stream().map(CompetenceJPA::toCompetence).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        competenceDAO.deleteById(id);
    }

    @Override
    public Competence save(Competence competence) {
        return competenceDAO.save(new CompetenceJPA(competence)).toCompetence();
    }

    @Override
    public Competence findById(Long id) {
        return competenceDAO.findById(id).orElseThrow(()-> new MyProjectException404(ErrorCodes.COMPETENCE_NOT_FOUND)).toCompetence();
    }
}
