package com.dojo.stage.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegleDAO extends JpaRepository<RegleJPA, Long> {

    	//@Query(value="SELECT * FROM  LIBRARY WHERE DIRECTOR_SURNAME = :surname ", nativeQuery = true)
//	List<LibraryJPA> searchBysurnameDirectornative( String surname);
      	List<RegleJPA> findAllByOrderById ();
      	List<RegleJPA> findByPosteType (String  posteType);
      	List<RegleJPA> findByCompetencesId (Long competenceId);
}
