package com.dojo.stage.saisieTransformation;

import com.dojo.stage.domain.SaisieTransformation;
import com.dojo.stage.domain.SaisieTransformationRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SaisieTransformationImplTest {

    @Autowired
    private SaisieTransformationRepository saisieTransformationRepository;

    @Test
    @Order(1)
    public void loadData() {
        SaisieTransformationData.loadData(saisieTransformationRepository);
    }

    @ParameterizedTest
    @ValueSource(longs = { 1L,  2L,  3L})
    @Order(2)
    public void when_FindAll_then_return_all_saisie(Long id) {
        List<SaisieTransformation> saisies = saisieTransformationRepository.findAll();
        saisies.sort((a,b) ->  (int)( a.getId() - b.getId()) );
        assertAll(
                ()->assertEquals(3, saisies.size()),
                ()->assertEquals(SaisieTransformationData.generate(1),saisies.get(0)),
                ()->assertEquals(SaisieTransformationData.generate(2),saisies.get(1)),
                ()->assertEquals(SaisieTransformationData.generate(3),saisies.get(2))
        );
    }

    @ParameterizedTest
    @ValueSource(longs = { 1L,  2L,  3L})
    @Order(2)
    public void when_FindByid_then_return_saisie(Long id) {
        SaisieTransformation saisie = saisieTransformationRepository.findById(id);
        Assertions.assertEquals(id,saisie.getId());
    }

    @ParameterizedTest
    @ValueSource(strings = {"XX0001", "138258", "x85066"})
    @Order(2)
    public void when_FindByCollaborateurUid_then_return_saisie(String uid){
        List<SaisieTransformation> saisies = saisieTransformationRepository.findByCollaborateurUid(uid);
        Assertions.assertEquals(1,saisies.size());
        Assertions.assertEquals(uid,saisies.get(0).getCollaborateurUid());
    }

    @Test
    @Order(4)
    public void when_delete_then_delete_one() {
        saisieTransformationRepository.delete(1L);
        assertEquals(2, saisieTransformationRepository.findAll().size());
        saisieTransformationRepository.delete(2L);
        assertEquals(1, saisieTransformationRepository.findAll().size());
        saisieTransformationRepository.delete(3L);
        assertEquals(0, saisieTransformationRepository.findAll().size());
        loadData();
    }
}
