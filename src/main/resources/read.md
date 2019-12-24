#Chargement des règles Tables (regle et competence
  *  Laissez hibernate créer les tables. Si vous les avez déjà créé via un create Table, il faut les détruire.
  *  Lors du premier lancement, changer le fichier application.properties pour mettre spring.jpa.hibernate.ddl-auto=create
  *  Chargez les tables avec le fichier dateChargementReglesCompetences.sql
  *  Remodifier le fichier application.properties pour mettre spring.jpa.hibernate.ddl-auto=none

