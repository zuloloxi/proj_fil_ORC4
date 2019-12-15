package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Collaborateur;
import com.dojo.stage.domain.InputRepository;
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


}


