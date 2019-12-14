package com.dojo.stage.application;

import com.dojo.stage.domain.OutputFile;
import com.dojo.stage.domain.OutputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class OutputService {

    @Autowired
    private OutputRepository outputRepository;

    public List<OutputFile> listAll() {
        return this.outputRepository.findAll();
    }
}
