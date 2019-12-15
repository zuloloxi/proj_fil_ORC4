package com.dojo.stage.domain;

import java.util.List;

public interface OutputRepository {
    List<OutputFile> findAll();
    Long save(OutputFile outputFile);
}
