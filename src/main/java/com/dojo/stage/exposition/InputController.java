package com.dojo.stage.exposition;


import com.dojo.stage.application.InputService;
import com.dojo.stage.domain.Collaborateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class InputController {

    @Autowired
    private InputService inputService;

    @RequestMapping(method = RequestMethod.GET, path = {"/inputs/"})
    public List<Collaborateur> getAllInputs() {
        return this.inputService.getAllInputs(); }


    @RequestMapping(method = RequestMethod.GET, path = {"/inputs/{id}"})
    public Collaborateur getOneInput(@PathVariable("id") Long id) {
        return this.inputService.getOneInput(id);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/inputs"})
    @ResponseStatus(HttpStatus.CREATED)
    public Long createInputs(@Valid @RequestBody Collaborateur collaborateur) {
        return this.inputService.createInputs(collaborateur);
    }


    @RequestMapping(method = RequestMethod.DELETE, path = {"/inputs/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteInputs(@PathVariable("id") Long id) {
        this.inputService.deleteInputs(id);
    }
}
