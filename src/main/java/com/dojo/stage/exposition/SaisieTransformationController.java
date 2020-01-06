package com.dojo.stage.exposition;

import com.dojo.stage.application.SaisieTransformationService;
import com.dojo.stage.domain.SaisieTransformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class SaisieTransformationController {

    @Autowired
    private SaisieTransformationService saisieTransformationService;

    @RequestMapping(method = RequestMethod.GET, path = {"/saisies/"})
    public List<SaisieTransformation> getAll() {
        return this.saisieTransformationService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/saisies/{id}"})
    public SaisieTransformation getById(@PathVariable("id") Long id ) {
        return this.saisieTransformationService.getById(id);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/saisies"})
    @ResponseStatus(HttpStatus.CREATED)
    public SaisieTransformation create(@Valid @RequestBody SaisieTransformation saisieTransformation) {
        return this.saisieTransformationService.create(saisieTransformation);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/saisies/{id}"})
    public SaisieTransformation update(@Valid @RequestBody SaisieTransformation saisieTransformation, @PathVariable("id") Long id) {
        return this.saisieTransformationService.update(saisieTransformation, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/saisies/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        this.saisieTransformationService.delete(id);
    }


}

