package com.dojo.stage.saisieTransformation;

import com.dojo.stage.domain.SaisieTransformation;
import com.dojo.stage.domain.SaisieTransformationRepository;
import com.dojo.stage.exposition.SaisieTransformationController;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SaisieTransformationIntegrationTest {

    @Autowired
    private SaisieTransformationRepository saisieTransformationRepository;

    @Autowired
    private SaisieTransformationController saisieTransformationController;

    static int numberOfLinesInserted = 0;

    @BeforeEach
//    @Order(1)
    public void loadData() {
        numberOfLinesInserted = SaisieTransformationData.loadData(saisieTransformationRepository);
    }

    @Test
    public void test_getAll_returns_well_all_inserted_saisies(){
        List<SaisieTransformation> saisies = saisieTransformationController.getAll();
        for (int i = 0; i < numberOfLinesInserted; i++) {
            Assertions.assertEquals(SaisieTransformationData.generate(i+1),saisies.get(i));
        }
    }

    @Test
    public void test_getById_returns_well_saisie(){
        Assertions.assertEquals(SaisieTransformationData.generate(1),saisieTransformationController.getById(1L));
    }

    @Test
    public void test_getById_returns_404_when_not_found(){
        Assertions.assertThrows(RuntimeException.class, () ->  saisieTransformationController.getById(0L));
        System.out.println("toto");
    }

//
//
//    @RequestMapping(method = RequestMethod.POST, path = {"/saisies"})
//    @ResponseStatus(HttpStatus.CREATED)
//    public SaisieTransformation create(@Valid @RequestBody SaisieTransformation saisieTransformation) {
//        return this.saisieTransformationService.create(saisieTransformation);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, path = {"/saisies/{id}"})
//    public SaisieTransformation update(@Valid @RequestBody SaisieTransformation saisieTransformation, @PathVariable("id") Long id) {
//        return this.saisieTransformationService.update(saisieTransformation, id);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, path = {"/saisies/{id}"})
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void delete(@PathVariable("id") Long id) {
//        this.saisieTransformationService.delete(id);
//    }



}
