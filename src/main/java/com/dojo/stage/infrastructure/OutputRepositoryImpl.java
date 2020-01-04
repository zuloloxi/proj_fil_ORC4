package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.Output;
import com.dojo.stage.domain.OutputRepository;
import com.dojo.stage.domain.exception.ErrorCodes;
import com.dojo.stage.domain.exception.MyProjectException500;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class OutputRepositoryImpl implements OutputRepository {
    @Autowired
    private OutputFileDAO outputFileDAO;

    @Override
    public List<Output> findAll() {
        return outputFileDAO.findAll().stream().map(OutputFileJPA::toOutput).collect(Collectors.toList());
    }

    @Override
    public Long save(Output output) {
        OutputFileJPA outputFileJPA = outputFileDAO.save(new OutputFileJPA(output));
        return outputFileJPA.getId();
    }

    @Override
    public Long update(Output output, Long id) {
        OutputFileJPA outputFileJPA = outputFileDAO.save(new OutputFileJPA(output, id));
        return outputFileJPA.getId();
    }

    @Override
    public Output get(Long id) {
        return outputFileDAO.findById(id).map(OutputFileJPA::toOutputFile).orElseThrow(() -> new MyProjectException500(ErrorCodes.OUTPUT_NOT_FOUND));
    }

    @Override
    public void delete(Long id) {
        outputFileDAO.deleteById(id);
    }

    @Override
    public void deleteAll() {
        outputFileDAO.deleteAll();
    }
}