package com.dojo.stage.exposition;

import com.dojo.stage.application.OutputService;
import com.dojo.stage.domain.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class OutputController {

    @Autowired
    private OutputService outputService;

    @RequestMapping(method = RequestMethod.GET, path = {"/outputs"})
    public List<Output> listAllOutputs() {
        return this.outputService.listAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/outputs"})
    @ResponseStatus(HttpStatus.CREATED)
    public Long createOutput(@Valid @RequestBody OutputDTO outputDTO) {
        return this.outputService.create(OutputMapper.mapToOutput(outputDTO));
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/outputs/publishResults"})
    @ResponseStatus(HttpStatus.CREATED)
    public void createOutputs(@Valid @RequestBody List<OutputDTO> listOutputDTO) {
        this.outputService.create(OutputMapper.mapToListOutputs(listOutputDTO));
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/outputs/{id}"})
    public OutputDTO detailOutput(@PathVariable("id") Long id) {
        return OutputMapper.mapToOutputFileDTO(this.outputService.obtain(id));
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/outputs/{id}"})
    public void updateOutput(@PathVariable("id") Long id, @RequestBody OutputDTO outputDTO) {
        this.outputService.update(id, OutputMapper.mapToOutput(outputDTO));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/outputs/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeOutput(@PathVariable("id") Long id) {
        this.outputService.remove(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/outputs"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeAllOutputs() {
        this.outputService.removeAll();
    }
}
