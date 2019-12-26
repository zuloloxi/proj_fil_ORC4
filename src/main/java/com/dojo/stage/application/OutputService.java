package com.dojo.stage.application;

import com.dojo.stage.domain.Output;
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

    public List<Output> listAll() {
        return this.outputRepository.findAll();
    }

    public Long create(Output newOutput) { return this.outputRepository.save(newOutput); }

    public void create(List<Output> listNewOutputs) {
        for (Output newOutput :listNewOutputs){
            this.outputRepository.save(newOutput);
        }
    }

    public Output obtain(Long id) {
        return this.outputRepository.get(id);
    }

    public void update(Long id, Output outputWithNewInformations) {
        Output output = obtain(id);
        output.update(outputWithNewInformations);
        this.outputRepository.update(output, id);
    }

    public void remove(Long id){
//        obtain(id);
        outputRepository.delete(id);
    }

    public void removeAll(){
        outputRepository.deleteAll();
    }


}
