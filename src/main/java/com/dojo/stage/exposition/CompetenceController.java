package com.dojo.stage.exposition;

import com.dojo.stage.application.CompetenceService;
import com.dojo.stage.application.RegleService;
import com.dojo.stage.domain.Competence;
import com.dojo.stage.domain.Regle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CompetenceController {

    @Autowired
    private CompetenceService competenceService;

    @RequestMapping(method = RequestMethod.GET, path = {"/competences/"})
    public List<Competence> getAll() {
        return this.competenceService.getAll(); }

    @RequestMapping(method = RequestMethod.GET, path = {"/competences/{id}"})
    public Competence getById(@PathVariable("id") Long id ) {
        return this.competenceService.getById(id);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/competences"})
    @ResponseStatus(HttpStatus.CREATED)
    public Competence create(@Valid @RequestBody Competence competence) {
        return this.competenceService.create(competence);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/competences/{id}"})
    public Competence update(@Valid @RequestBody Competence competence, @PathVariable("id") Long id) {
        return this.competenceService.update(competence, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/competences/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        this.competenceService.delete(id);
    }
}

