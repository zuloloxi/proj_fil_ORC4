CREATE UNIQUE INDEX "CompetenceUnique"
    ON public.competence USING btree
    (competence COLLATE pg_catalog."default" text_pattern_ops ASC NULLS LAST)
    TABLESPACE pg_default;
