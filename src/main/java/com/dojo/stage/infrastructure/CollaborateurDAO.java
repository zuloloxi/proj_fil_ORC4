package com.dojo.stage.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CollaborateurDAO extends JpaRepository<CollaborateurJPA, Long> {

    @Query(value = "SELECT * FROM collaborateur WHERE uid = :uid", nativeQuery = true)
    CollaborateurJPA findByUid (String  uid);
}
