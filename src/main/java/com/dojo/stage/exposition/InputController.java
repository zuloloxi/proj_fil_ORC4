package com.dojo.stage.exposition;


import com.dojo.stage.application.InputService;
import com.dojo.stage.domain.Collaborateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InputController {

    @Autowired
    private InputService inputService;

    @RequestMapping(method = RequestMethod.GET, path = {"/inputs/"})
    public List<Collaborateur> getAllInputs() {
        return this.inputService.getAllInputs(); }

}
