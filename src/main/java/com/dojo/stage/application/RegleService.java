package com.dojo.stage.application;

import com.dojo.stage.domain.Regle;
import com.dojo.stage.domain.RegleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class RegleService {
    @Autowired
    private RegleRepository regleRepository;

    public List<Regle> getAll() {
        return this.regleRepository.findAll();
    }

    public Regle getRegleByPosteType (String posteType) {
        return this.regleRepository.findByPosteType(posteType);
    }

    public Regle getById(Long id) {
        return this.regleRepository.findById(id);
    }

    public Regle create(Regle regle) {
        return this.regleRepository.save(regle);
    }

    public void delete (Long id) {
        regleRepository.delete(id);
    }

    public Regle update(Regle regleForUpdate, Long id) {
        Regle regle = getById(id);
        regle.update(regleForUpdate);
        return regleRepository.save(regle);
    }

}
