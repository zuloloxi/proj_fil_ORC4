package com.dojo.stage.exposition;

import com.dojo.stage.application.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class OutputResource {

    @Autowired
    private OutputService outputService;

    @RequestMapping(method = RequestMethod.GET, path = {"/outputs"})
    public List<OutputFileDTO> listAllOutputs() {
        return OutputAdapter.adaptToOutputDTOList(this.outputService.getAllOutputs());
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/outputs"})
    @ResponseStatus(HttpStatus.CREATED)
    public Long createOutput(@Valid @RequestBody OutputFileDTO outputFileDTO) {
        return this.outputService.create(OutputAdapter.transformToOutputFile(outputFileDTO));
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/outputs/{id}"})
    public OutputFileDTO detailOutputFile(@PathVariable("id") Long id) {
        return OutputAdapter.adaptToOutputFileDTO(this.outputService.obtain(id));
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/outputs/{id}"})
    public void updateOutputFile(@PathVariable("id") Long id, @RequestBody OutputFileDTO outputFileDTO) {
        this.outputService.update(id, OutputAdapter.transformToOutputFile(outputFileDTO));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/outputs/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeOutput(@PathVariable("id") Long id) {
        this.outputService.remove(id);
    }
}
