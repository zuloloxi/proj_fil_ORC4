package com.dojo.stage.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutputFileDAO extends JpaRepository<OutputFileJPA, Long> {

//    List<Library> findByType (Type type);
//    List<Library> findByAddress_Number (int number);
//    @Query (value = "SELECT * FROM LIBRARY WHERE Director_Surname = :name", nativeQuery = true)
//    List<Library> toto (@Param("name") String name);
//    @Query (value = "SELECT lib FROM LIBRARY lib WHERE lib.director.surname = ?1")
////    @Query (value = "FROM LIBRARY WHERE director.surname = ?1")
//    List<Library> findByDirectorSurname (String surName);
//    @Query (value = "SELECT * FROM LIBRARY WHERE :where", nativeQuery = true)
//    List<Library> findWhere (@Param("where") String where);
}
