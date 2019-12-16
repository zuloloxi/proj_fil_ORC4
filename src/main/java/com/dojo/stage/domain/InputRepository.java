package com.dojo.stage.domain;

import java.util.List;

public interface InputRepository {

    List<Collaborateur> findAll();
    Collaborateur findOne(Long id);
    Long save (Collaborateur collaborateur);
    void delete(Long id);

}
