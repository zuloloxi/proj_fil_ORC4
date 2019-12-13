package com.dojo.stage.repository;

import com.dojo.stage.domain.OutputFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutputFileRepository extends JpaRepository<OutputFile, Long> {
}
