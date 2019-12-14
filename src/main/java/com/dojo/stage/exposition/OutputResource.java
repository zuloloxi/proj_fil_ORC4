package com.dojo.stage.exposition;

import com.dojo.stage.application.OutputService;
import com.dojo.stage.domain.OutputFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OutputResource {

    @Autowired
    private OutputService outputService;

    @RequestMapping(method = RequestMethod.GET, path = {"/outputs/"})
    public List<OutputFile> getOutputs() {
        return this.outputService.listAll(); }
}
