package com.dojo.stage.exposition;


import com.dojo.stage.application.InputService;
import com.dojo.stage.domain.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class InputController {

    @Autowired
    private InputService inputService;

    @RequestMapping(method = RequestMethod.GET, path = {"/inputs"})
    public List<CollaborateurDTO> findAll() {
        return CollaborateurMapper.mapToCollaborateurDTOList(this.inputService.getAllInputs());
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/inputs/{id}"})
    public CollaborateurDTO findOne(@PathVariable("id") Long id) {
        return CollaborateurMapper.mapToCollaborateurDTO(this.inputService.getOneInput(id));
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/inputs/uid/{uid}"})
    public  CollaborateurDTO findUid(@PathVariable("uid") String uid){
        return CollaborateurMapper.mapToCollaborateurDTO(this.inputService.getUid(uid));
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/inputs"})
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@Valid @RequestBody CollaborateurDTO collaborateurDTO) {
        return this.inputService.createInputs(CollaborateurMapper.mapToCollaborateur(collaborateurDTO));
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/inputs/{id}"})
    public void updateOne(@PathVariable("id") Long id, @RequestBody CollaborateurDTO collaborateurDTO) {
        this.inputService.updateInput(id, CollaborateurMapper.mapToCollaborateur(collaborateurDTO));
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/inputs/updateuid/{uid}"})
    public void updateByUid(@PathVariable("uid") String uid, @RequestBody CollaborateurDTO collaborateurDTO) {
        this.inputService.updateByUid(uid, CollaborateurMapper.mapToCollaborateur(collaborateurDTO));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/inputs/{id}"})
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable("id") Long id) {
        this.inputService.deleteInputs(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/inputs/deleteuid/{uid}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByUid(@PathVariable("uid") String uid) {
        this.inputService.deleteByUid(uid);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/inputs"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll() {
        this.inputService.deleteAllInputs();
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/inputs/transform/{id}"})
    public Output getOneInputToTransform(@PathVariable("id") Long id) {
        return this.inputService.toOutput(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/inputs/transform/uid/{uid}"})
    public Output getOneInputToTransformByUid(@PathVariable("uid") String uid) {
        return this.inputService.toOutputByUid(uid);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/inputs/transform"})
    public List<Output> transformAllInputs() {
        return this.inputService.toOutputs();
    }

}
