Pour le chargement initial des données : ajouter dans application.properties :

spring.jpa.hibernate.ddl-auto=create-drop
spring.datasource.initialization-mode=always
spring.datasource.data=classpath:data/collaborateur.sql,classpath:data/competence.sql,classpath:data/regle.sql,classpath:data/sequence.sql
