package com.dojo.stage.application;

import com.dojo.stage.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
@Transactional
public class InputService {

    @Autowired
    private InputRepository inputRepository;
    @Autowired
    private RegleRepository regleRepository;

    private Regle regleCurrent = new Regle();
    private String fonctionCurrent = "";

    public List<Collaborateur> getAllInputs() {
        return this.inputRepository.findAll();
    }

    public Collaborateur getOneInput (Long id) {
        return this.inputRepository.findOne(id);
    }

    public Collaborateur getUid (String uid) {
        return this.inputRepository.findByUid(uid);
    }

    public Long createInputs(Collaborateur newCollaborateur) {
        return this.inputRepository.save(newCollaborateur);
    }

    public void updateInput(Long id, Collaborateur updatedCollaborateur) {
        Collaborateur collaborateur = getOneInput(id);
        collaborateur.update(updatedCollaborateur);
        this.inputRepository.update(id,collaborateur);
    }

    public void updateByUid(String uid, Collaborateur collaborateur) {
        this.inputRepository.updateByUid(uid, collaborateur);
    }

    public void deleteInputs (Long id) {
        this.inputRepository.delete(id);
    }

    public void deleteByUid (String uid) {
        this.inputRepository.deleteByUid(uid);
    }

    public void deleteAllInputs () {
        this.inputRepository.deleteAll();
    }

    public Output toOutput (Long id) {
        Collaborateur collaborateurToTransform = inputRepository.findOne(id);
        return collaborateurToTransform.toOutput(regleRepository.findByPosteType(collaborateurToTransform.getFonction()));
    }

    public Output toOutputByUid (String uid) {
        Collaborateur collaborateurToTransform = inputRepository.findByUid(uid);
        return collaborateurToTransform.toOutput(regleRepository.findByPosteType(collaborateurToTransform.getFonction()));
    }

    public List<Output> toOutputs () {
        List<Collaborateur> CollaborateursToTransform = inputRepository.findAllOrderByFonctionAsc();
        return CollaborateursToTransform.stream().map(collaborateur ->  {
            if (!collaborateur.getFonction().equals(regleCurrent.getPosteType()) && (!fonctionCurrent.equals(collaborateur.getFonction())) ){
                fonctionCurrent = collaborateur.getFonction();
                regleCurrent = regleRepository.findByPosteTypeSTP(collaborateur.getFonction());
            }
            return collaborateur.toOutput(regleCurrent);})
        .collect(Collectors.toList());
    }
}
