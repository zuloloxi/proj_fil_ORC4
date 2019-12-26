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

    public List<OutputFile> getAllOutputs() {
        return this.outputRepository.findAll();
    }

    public Long create(OutputFile newOutputFile) {
        return this.outputRepository.save(newOutputFile);
    }

    public OutputFile obtain(Long id) {
        return this.outputRepository.get(id);
    }


    public void update(Long id, OutputFile outputFileWithNewInformations) {
        OutputFile outputFile = obtain(id);
        outputFile.update(outputFileWithNewInformations);
        this.outputRepository.update(outputFile, id);
    }

    public void remove(Long id){
//        obtain(id);
        outputRepository.delete(id);
    }
}
