package com.dojo.stage.application;

import com.dojo.stage.domain.Collaborateur;
import com.dojo.stage.domain.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class InputService {

    @Autowired
    private InputRepository inputRepository;

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

}
