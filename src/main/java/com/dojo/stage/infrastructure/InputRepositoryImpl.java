package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Collaborateur;
import com.dojo.stage.domain.InputRepository;
import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class InputRepositoryImpl implements InputRepository {

    @Autowired
    private CollaborateurDAO collaborateurDAO;

    @Override
    public List<Collaborateur> findAll() {
        return collaborateurDAO.findAll().stream().map(CollaborateurJPA::toCollaborateur).collect(Collectors.toList());
    }


    @Override
    public Collaborateur findOne(Long id) {
        return collaborateurDAO.findById(id).map(CollaborateurJPA::toCollaborateur).orElseThrow(() -> new MyProjectException(ErrorCodes.INPUT_NOT_FOUND));
    }

    @Override
    public Collaborateur findByUid(String uid) {
        if (collaborateurDAO.findByUid(uid) == null) {
            throw new MyProjectException(ErrorCodes.INPUT_NOT_FOUND);
        } else {
            return collaborateurDAO.findByUid(uid).toCollaborateur();
        }
    }

    @Override
    public Long save(Collaborateur collaborateur) {
        CollaborateurJPA collaborateurJPA = collaborateurDAO.save(new CollaborateurJPA(collaborateur));
        return collaborateurJPA.getId();
    }

    @Override
    public Long update(Long id, Collaborateur collaborateur) {
        CollaborateurJPA collaborateurJPA = collaborateurDAO.save(new CollaborateurJPA(id,collaborateur));
        return collaborateurJPA.getId();
    }

    @Override
    public  void updateByUid(String uid, Collaborateur collaborateur) {
        if (collaborateurDAO.findByUid(uid) == null) {
            throw new MyProjectException(ErrorCodes.INPUT_NOT_FOUND);
        } else {
            collaborateurDAO.updateByUid(uid, collaborateur.getCivilite(), collaborateur.getNom(),
                    collaborateur.getPrenom(), collaborateur.getFonction(), collaborateur.getTelephone(),
                    collaborateur.getMail(), collaborateur.getEtage(), collaborateur.getUoAffectation(),
                    collaborateur.getCodeImmeubleEmplacementCollaborateur(), collaborateur.getRegion(),
                    collaborateur.getCodeRegion(), collaborateur.getNiveauTerritoire(), collaborateur.getCodeTerritoire(),
                    collaborateur.getNiveauEntite(), collaborateur.getCodeEntite(), collaborateur.getNiveauAgence(),
                    collaborateur.getCodeAgence(), collaborateur.getLocalisationCollaborateur(),
                    collaborateur.getPj(), collaborateur.getaMigrer());
        }
    }

    @Override
    public void delete(Long id) {
        collaborateurDAO.deleteById(id);
    }

    @Override
    public void deleteByUid(String uid) {
        collaborateurDAO.deleteByUid(uid);
    }

    @Override
    public void deleteAll() {
        collaborateurDAO.deleteAll();
    }

}


