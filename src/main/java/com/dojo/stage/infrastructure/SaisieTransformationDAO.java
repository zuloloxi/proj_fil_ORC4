package com.dojo.stage.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaisieTransformationDAO  extends JpaRepository<SaisieTransformationJPA, Long> {
    List<SaisieTransformationJPA> findAllByOrderById ();
    List<SaisieTransformationJPA> findByCollaborateurUid (String uid);

}
