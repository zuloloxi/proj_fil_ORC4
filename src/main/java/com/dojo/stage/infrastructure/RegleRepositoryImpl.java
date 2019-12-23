package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Regle;
import com.dojo.stage.domain.RegleRepository;
import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class RegleRepositoryImpl implements RegleRepository {

    @Autowired
    private RegleDAO regleDAO;

    @Override
    public List<Regle> findAll() {
        return regleDAO.findAll().stream().map(regleJPA -> regleJPA.toRegle()).collect(Collectors.toList());
    }

    @Override
    public Regle findByPosteType(String posteType) {
        if (regleDAO.findByPosteType(posteType).size() != 0) {
            return regleDAO.findByPosteType(posteType).get(0)
                    .toRegle();
        } else {
            throw new MyProjectException(ErrorCodes.REGLE_NOT_FOUND);
        }
    }

    @Override
    public void delete(Long id) {
        regleDAO.deleteById(id);
    }

    @Override
    public Regle save(Regle regle) {

        return regleDAO.save(new RegleJPA(regle)).toRegle();
    }

    @Override
    public Regle findById(Long id) {
        return regleDAO.findById(id).orElseThrow(()-> new MyProjectException(ErrorCodes.REGLE_NOT_FOUND)).toRegle();
    }


}
