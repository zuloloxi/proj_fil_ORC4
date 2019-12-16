package com.dojo.stage.domain.exception;

import java.util.HashSet;
import java.util.Set;

public class MyProjectException extends RuntimeException {
    private Set<String> codeErreurs = new HashSet<>();

    public MyProjectException(String codeErreur) {
        this.codeErreurs.add(codeErreur);
    }

    public MyProjectException(Set<String> codeErreurs) {
        this.codeErreurs = codeErreurs;
    }

    public Set<String> getCodeErreurs() {
        return codeErreurs;
    }
}