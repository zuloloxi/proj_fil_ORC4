package com.dojo.stage.application;

import com.dojo.stage.domain.*;
import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException400;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SaisieTransformationService {

    @Autowired
    private SaisieTransformationRepository saisieTransformationRepository;

    public List<SaisieTransformation> getAll() {
        return this.saisieTransformationRepository.findAll();
    }

    public SaisieTransformation getById(Long id) {
        return this.saisieTransformationRepository.findById(id);
    }

    public SaisieTransformation create(SaisieTransformation saisieTransformation) {
        if (saisieTransformationRepository.findByCollaborateurId(saisieTransformation.getCollaborateurId()).isEmpty()) {
            return this.saisieTransformationRepository.save(saisieTransformation);
        } else {
            throw new MyProjectException400(ErrorCodes.COMPETENCE_ALREADY_EXISTS);
        }
    }

    public void delete(Long id) {
        saisieTransformationRepository.delete(id);
    }


    public SaisieTransformation update(SaisieTransformation saisieTransformationForUpdate, Long id) {
        SaisieTransformation saisieTransformation = getById(id);
        saisieTransformation.update(saisieTransformationForUpdate);
        return saisieTransformationRepository.save(saisieTransformation);
    }

}
