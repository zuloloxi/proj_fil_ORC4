package com.dojo.stage.exposition;

import com.dojo.stage.application.RegleService;
import com.dojo.stage.domain.Regle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class RegleController {

    @Autowired
    private RegleService regleService;

    @RequestMapping(method = RequestMethod.GET, path = {"/regles"})
    public List<Regle> getAll() {
        return this.regleService.getAll(); }

    @RequestMapping(method = RequestMethod.GET, path = {"/regles/{id}"})
    public Regle getById(@PathVariable("id") Long id ) {
        return this.regleService.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/regles/posteType/{posteType}"})
    public Regle getByPosteType(@PathVariable("posteType") String posteType  ) {
        return this.regleService.getRegleByPosteType(posteType);
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/regles/competenceId/{competenceId}"})
    public List<Regle> getByPosteType(@PathVariable("competenceId") Long competenceId  ) {
        return this.regleService.getRegleByCompetenceId(competenceId);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/regles"})
    @ResponseStatus(HttpStatus.CREATED)
    public Regle create(@Valid @RequestBody Regle regle) {
        return this.regleService.create(regle);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/regles/{id}"})
    public Regle update(@Valid @RequestBody Regle regle, @PathVariable("id") Long id) {
        return this.regleService.update(regle, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/regles/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        this.regleService.delete(id);
    }
}

