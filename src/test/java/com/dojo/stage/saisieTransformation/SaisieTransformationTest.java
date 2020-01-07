package com.dojo.stage.saisieTransformation;

import com.dojo.stage.domain.SaisieTransformation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
//@DataJpaTest
@SpringBootTest
public class SaisieTransformationTest {

//    @Autowired
//    private TestEntityManager entityManager;

    @Test
    void test_all_getter() {
        SaisieTransformation saisieTransformation = new SaisieTransformation(0L,"785858", "domaine", "equipe", "profil", "competences");

        assertAll(
                ()->assertEquals(0L,saisieTransformation.getId()),
                ()->assertEquals("785858",saisieTransformation.getCollaborateurUid()),
                ()->assertEquals("domaine",saisieTransformation.getDomaine()),
                ()->assertEquals("equipe",saisieTransformation.getEquipe()),
                ()->assertEquals("profil",saisieTransformation.getProfil()),
                ()->assertEquals("competences",saisieTransformation.getCompetences())
                );
    }
}
