package com.dojo.stage.domain;

import java.util.List;

public interface InputRepository {

    List<Collaborateur> findAll();
    Collaborateur findOne(Long id);
    Collaborateur findByUid(String uid);
    Long save (Collaborateur collaborateur);
    Long update(Long id, Collaborateur collaborateur);
    void updateByUid(String uid, Collaborateur collaborateur);
    void delete(Long id);
    void deleteByUid(String uid);
    void deleteAll();

}
