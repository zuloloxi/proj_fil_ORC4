package com.dojo.stage.infrastructure;

import com.dojo.stage.domain.OutputFile;
import com.dojo.stage.domain.OutputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class OutputRepositoryImpl implements OutputRepository {
    @Autowired
    private OutputFileDAO outputFileDAO;

    @Override
    public List<OutputFile> findAll() {
        return outputFileDAO.findAll().stream().map(OutputFileJPA::toOutputFile).collect(Collectors.toList());
    }

    @Override
    public Long save(OutputFile outputFile) {
        OutputFileJPA outputFileJPA = outputFileDAO.save(new OutputFileJPA(outputFile));
        return outputFileJPA.getId();
    }
}