package com.dojo.stage.application;

import com.dojo.stage.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class TransformationService {

    @Autowired
    private InputRepository inputRepository;
    @Autowired
    private RegleRepository regleRepository;
    @Autowired
    private SaisieTransformationRepository saisieTransformationRepository;

    private Regle regleCurrent = new Regle();
    private String fonctionCurrent = "";

    public Output toOutput (Collaborateur collaborateur) {
        Optional<Output> outputFromSaisie = toOutputBySaisie(collaborateur);
        return outputFromSaisie.orElse(collaborateur.toOutput(regleRepository.findByPosteType(collaborateur.getFonction())));
    }

    private Optional<Output> toOutputBySaisie(Collaborateur collaborateur) {
        List<SaisieTransformation> saisieTransformation = saisieTransformationRepository.findByCollaborateurUid(collaborateur.getUid());
        if (saisieTransformation.size() > 0 ) {
            return Optional.of(collaborateur.toOutput(saisieTransformation.get(0)));
        } else {
            return Optional.empty();
        }
    }

    public List<Output> toOutputs () {
        List<Collaborateur> CollaborateursToTransform = inputRepository.findAllOrderByFonctionAsc();
        return CollaborateursToTransform
                .stream()
                .map(collaborateur -> toOutputBySaisie(collaborateur).orElse(getOutputByRegle(collaborateur)))
                .collect(Collectors.toList());
    }

    private Output getOutputByRegle(Collaborateur collaborateur) {
        if (!collaborateur.getFonction().equals(regleCurrent.getPosteType()) && (!fonctionCurrent.equals(collaborateur.getFonction())) ){
            fonctionCurrent = collaborateur.getFonction();
            regleCurrent = regleRepository.findByPosteTypeSTP(collaborateur.getFonction());
        }
        return collaborateur.toOutput(regleCurrent);
    }
}
