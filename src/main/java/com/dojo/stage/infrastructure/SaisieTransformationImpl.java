package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.SaisieTransformation;
import com.dojo.stage.domain.SaisieTransformationRepository;
import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException404;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class SaisieTransformationImpl implements SaisieTransformationRepository {

    @Autowired
    private SaisieTransformationDAO saisieTransformationDAO;

    @Override
    public List<SaisieTransformation> findAll() {
        return saisieTransformationDAO.findAll().stream().map(SaisieTransformationJPA::toSaisieTransformation).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        saisieTransformationDAO.deleteById(id);
    }

    @Override
    public SaisieTransformation save(SaisieTransformation saisieTransformation) {
        return saisieTransformationDAO.save(new SaisieTransformationJPA(saisieTransformation)).toSaisieTransformation();
    }

    @Override
    public SaisieTransformation findById(Long id) {
        return saisieTransformationDAO.findById(id).orElseThrow(()-> new MyProjectException404(ErrorCodes.SAISIE_NOT_FOUND)).toSaisieTransformation();
    }

    @Override
    public List<SaisieTransformation> findByCollaborateurId(Long id) {
        return saisieTransformationDAO.findByCollaborateurId(id).stream().map(SaisieTransformationJPA::toSaisieTransformation).collect(Collectors.toList());
    }
}
