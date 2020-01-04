package com.dojo.stage.domain.exception;

public final class ErrorCodes {
    private ErrorCodes() {}

    public static final String NOT_FOUND = "ERR_0001";
    public static final String OUTPUT_NOT_FOUND = NOT_FOUND + ".1";
    public static final String REGLE_NOT_FOUND = NOT_FOUND + ".2";
    public static final String COMPETENCE_NOT_FOUND = NOT_FOUND + ".3";
    public static final String INPUT_NOT_FOUND = NOT_FOUND + ".4";
    public static final String COMPETENCE = "ERR_0002";
    public static final String COMPETENCE_HAS_CHANGED = COMPETENCE + ".1";
    public static final String COMPETENCE_IS_STILL_USED = COMPETENCE + ".2";
    public static final String COMPETENCE_ALREADY_EXISTS = COMPETENCE + ".3";
    public static final String REGLE = "ERR_0003";
    public static final String DOMAINE_IS_EMPTY = REGLE + ".1";
    public static final String POSTE_TYPE_IS_EMPTY= REGLE + ".2";

//    public static final String BOOK_NOT_FOUND = NOT_FOUND + ".2";
//    public static final String LIBRARY_MUST_HAVE_A_DIRECTOR = "ERR_0002";
//    public static final String LIBRARY_MUST_HAVE_AN_ADDRESS = "ERR_0003";
//    public static final String DIRECTOR_MUST_HAVE_A_SURNAME = "ERR_0004";
//    public static final String DIRECTOR_MUST_HAVE_A_NAME = "ERR_0005";
}