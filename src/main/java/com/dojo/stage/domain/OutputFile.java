package com.dojo.stage.domain;


public class OutputFile {

     private String action ;
     private String identifiant ;
     private String nom ;
     private String prenom ;
     private String email ;
     private String emailCommerciale ;
     private String langue ;
     private String domaine ;
     private String equipe ;
     private String groupeCompetence;
     private String groupesReporting ;
     private String profil ;
     private String administration ;
     private String supervision ;
     private String agent ;
     private String statistiques ;
     private String enregistrement ;
     private String campagnes ;
     private String scripting ;
     private String historique ;
     private String suiviActions ;
     private String suiviAppels ;
     private String configurationAfficheursMuraux ;
     private String hypervision ;
     private String competences;
     private String site ;
     private String positionPrivee;
     private String positionCommerciale ;
     private String mobile ;
     private String domainesSupervises;
     private String equipesSupervisees;
     private String fluxSupervises;
     private String competencesSupervisees;
     private String groupesSupervises;
     private String sitesSupervises;
     private String canauxExternes ;
     private String pausesSupervisees;
     private String tachesSupervisees;
     private String compteursSupervises ;
     private String servicesSupervises ;
     private String alertesSeuilSupervisees ;
     private String categoriesAlertes ;
     private String modelesAlertes;
     private String panneauxSupervises ;
     private String missionsSupervisees ;
     private String annuairesSupervises ;
     private String strategiesRoutageSupervisees ;
     private String profilsSupervises ;
     private String planningsSupervises ;
     private String commentaires ;

     
     public OutputFile(String identifiant, String nom, String prenom, String email, String domaine, String equipe, String profil, String competences
                       ) {
          this.action = "";
          this.identifiant = identifiant;
          this.nom = nom;
          this.prenom = prenom;
          this.email = email;
          this.emailCommerciale = "";
          this.langue = "Français";
          this.domaine = domaine;
          this.equipe = equipe;
          this.groupeCompetence = "";
          this.groupesReporting = "";
          this.profil = profil;
          this.administration = "";
          this.supervision = "";
          this.agent = "";
          this.statistiques = "";
          this.enregistrement = "";
          this.campagnes = "";
          this.scripting = "";
          this.historique = "";
          this.suiviActions = "";
          this.suiviAppels = "";
          this.configurationAfficheursMuraux = "";
          this.hypervision = "";
          this.competences = competences;
          this.site = "";
          this.positionPrivee = "";
          this.positionCommerciale = "";
          this.mobile = "";
          this.domainesSupervises = "";
          this.equipesSupervisees = "";
          this.fluxSupervises = "";
          this.competencesSupervisees = "";
          this.groupesSupervises = "";
          this.sitesSupervises = "";
          this.canauxExternes = "";
          this.pausesSupervisees = "";
          this.tachesSupervisees = "";
          this.compteursSupervises = "";
          this.servicesSupervises = "";
          this.alertesSeuilSupervisees = "";
          this.categoriesAlertes = "";
          this.modelesAlertes = "";
          this.panneauxSupervises = "";
          this.missionsSupervisees = "";
          this.annuairesSupervises = "";
          this.strategiesRoutageSupervisees = "";
          this.profilsSupervises = "";
          this.planningsSupervises = "";
          this.commentaires = "";
     }

     public String getIdentifiant() {
          return identifiant;
     }

     public String getNom() {
          return nom;
     }

     public String getPrenom() {
          return prenom;
     }

     public String getEmail() {
          return email;
     }

     public String getDomaine() {
          return domaine;
     }

     public String getEquipe() {
          return equipe;
     }

     public String getProfil() {
          return profil;
     }

     public String getCompetences() {
          return competences;
     }
}
