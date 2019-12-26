package com.dojo.stage.domain;

import java.util.List;

public interface OutputRepository {
    List<Output> findAll();
    Long save(Output output);
    Long update(Output output, Long id);
    Output get(Long id);
    void delete(Long id);
    void deleteAll();
}
