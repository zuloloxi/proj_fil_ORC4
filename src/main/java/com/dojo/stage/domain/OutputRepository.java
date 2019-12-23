package com.dojo.stage.domain;

import java.util.List;

public interface OutputRepository {
    List<OutputFile> findAll();
    Long save(OutputFile outputFile);
    Long update(OutputFile outputFile, Long id);
    OutputFile get(Long id);
    void delete(Long id);
}
