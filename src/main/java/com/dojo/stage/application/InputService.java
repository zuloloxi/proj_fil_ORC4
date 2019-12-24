package com.dojo.stage.application;

import com.dojo.stage.domain.Collaborateur;
import com.dojo.stage.domain.InputRepository;
import com.dojo.stage.domain.OutputFile;
import com.dojo.stage.domain.RegleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class InputService {

    @Autowired
    private InputRepository inputRepository;
    @Autowired
    private RegleRepository regleRepository;

    public List<Collaborateur> getAllInputs() {
        return this.inputRepository.findAll();
    }

    public Collaborateur getOneInput (Long id) {
        return this.inputRepository.findOne(id);
    }

    public Long createInputs(Collaborateur newCollaborateur) {
        return this.inputRepository.save(newCollaborateur);
    }

    public void deleteInputs (Long id) {
        inputRepository.delete(id);
    }

    public OutputFile toOutput (Long id) {
        Collaborateur collaborateurToTransform = inputRepository.findOne(id);
        return collaborateurToTransform.toOutputFile(regleRepository.findByPosteType(collaborateurToTransform.getFonction()));

    }

}
