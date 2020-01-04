package com.dojo.stage.domain;


public class Output {

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

     
     public Output(String identifiant, String nom, String prenom, String email, String domaine, String equipe, String profil, String competences) {
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

     public Output(String action, String identifiant, String nom, String prenom, String email,
                   String emailCommerciale, String langue, String domaine, String equipe, String groupeCompetence,
                   String groupesReporting, String profil, String administration, String supervision, String agent,
                   String statistiques, String enregistrement, String campagnes, String scripting, String historique,
                   String suiviActions, String suiviAppels, String configurationAfficheursMuraux, String hypervision,
                   String competences, String site, String positionPrivee, String positionCommerciale, String mobile,
                   String domainesSupervises, String equipesSupervisees, String fluxSupervises, String competencesSupervisees,
                   String groupesSupervises, String sitesSupervises, String canauxExternes, String pausesSupervisees,
                   String tachesSupervisees, String compteursSupervises, String servicesSupervises, String alertesSeuilSupervisees,
                   String categoriesAlertes, String modelesAlertes, String panneauxSupervises, String missionsSupervisees,
                   String annuairesSupervises, String strategiesRoutageSupervisees, String profilsSupervises,
                   String planningsSupervises, String commentaires) {
          this.action = action;
          this.identifiant = identifiant;
          this.nom = nom;
          this.prenom = prenom;
          this.email = email;
          this.emailCommerciale = emailCommerciale;
          this.langue = langue;
          this.domaine = domaine;
          this.equipe = equipe;
          this.groupeCompetence = groupeCompetence;
          this.groupesReporting = groupesReporting;
          this.profil = profil;
          this.administration = administration;
          this.supervision = supervision;
          this.agent = agent;
          this.statistiques = statistiques;
          this.enregistrement = enregistrement;
          this.campagnes = campagnes;
          this.scripting = scripting;
          this.historique = historique;
          this.suiviActions = suiviActions;
          this.suiviAppels = suiviAppels;
          this.configurationAfficheursMuraux = configurationAfficheursMuraux;
          this.hypervision = hypervision;
          this.competences = competences;
          this.site = site;
          this.positionPrivee = positionPrivee;
          this.positionCommerciale = positionCommerciale;
          this.mobile = mobile;
          this.domainesSupervises = domainesSupervises;
          this.equipesSupervisees = equipesSupervisees;
          this.fluxSupervises = fluxSupervises;
          this.competencesSupervisees = competencesSupervisees;
          this.groupesSupervises = groupesSupervises;
          this.sitesSupervises = sitesSupervises;
          this.canauxExternes = canauxExternes;
          this.pausesSupervisees = pausesSupervisees;
          this.tachesSupervisees = tachesSupervisees;
          this.compteursSupervises = compteursSupervises;
          this.servicesSupervises = servicesSupervises;
          this.alertesSeuilSupervisees = alertesSeuilSupervisees;
          this.categoriesAlertes = categoriesAlertes;
          this.modelesAlertes = modelesAlertes;
          this.panneauxSupervises = panneauxSupervises;
          this.missionsSupervisees = missionsSupervisees;
          this.annuairesSupervises = annuairesSupervises;
          this.strategiesRoutageSupervisees = strategiesRoutageSupervisees;
          this.profilsSupervises = profilsSupervises;
          this.planningsSupervises = planningsSupervises;
          this.commentaires = commentaires;
     }

     public Output(){}



     public void update(Output outputWithNewInformation) {
          this.identifiant = outputWithNewInformation.getIdentifiant();
          this.nom = outputWithNewInformation.getNom();
          this.prenom = outputWithNewInformation.getPrenom();
          this.email = outputWithNewInformation.getEmail();
          this.domaine = outputWithNewInformation.getDomaine();
          this.equipe = outputWithNewInformation.getEquipe();
          this.profil = outputWithNewInformation.getProfil();
          this.competences = outputWithNewInformation.getCompetences();
     }


     public String getAction() {
          return action;
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

     public String getEmailCommerciale() {
          return emailCommerciale;
     }

     public String getLangue() {
          return langue;
     }

     public String getDomaine() {
          return domaine;
     }

     public String getEquipe() {
          return equipe;
     }

     public String getGroupeCompetence() {
          return groupeCompetence;
     }

     public String getGroupesReporting() {
          return groupesReporting;
     }

     public String getProfil() {
          return profil;
     }

     public String getAdministration() {
          return administration;
     }

     public String getSupervision() {
          return supervision;
     }

     public String getAgent() {
          return agent;
     }

     public String getStatistiques() {
          return statistiques;
     }

     public String getEnregistrement() {
          return enregistrement;
     }

     public String getCampagnes() {
          return campagnes;
     }

     public String getScripting() {
          return scripting;
     }

     public String getHistorique() {
          return historique;
     }

     public String getSuiviActions() {
          return suiviActions;
     }

     public String getSuiviAppels() {
          return suiviAppels;
     }

     public String getConfigurationAfficheursMuraux() {
          return configurationAfficheursMuraux;
     }

     public String getHypervision() {
          return hypervision;
     }

     public String getCompetences() {
          return competences;
     }

     public String getSite() {
          return site;
     }

     public String getPositionPrivee() {
          return positionPrivee;
     }

     public String getPositionCommerciale() {
          return positionCommerciale;
     }

     public String getMobile() {
          return mobile;
     }

     public String getDomainesSupervises() {
          return domainesSupervises;
     }

     public String getEquipesSupervisees() {
          return equipesSupervisees;
     }

     public String getFluxSupervises() {
          return fluxSupervises;
     }

     public String getCompetencesSupervisees() {
          return competencesSupervisees;
     }

     public String getGroupesSupervises() {
          return groupesSupervises;
     }

     public String getSitesSupervises() {
          return sitesSupervises;
     }

     public String getCanauxExternes() {
          return canauxExternes;
     }

     public String getPausesSupervisees() {
          return pausesSupervisees;
     }

     public String getTachesSupervisees() {
          return tachesSupervisees;
     }

     public String getCompteursSupervises() {
          return compteursSupervises;
     }

     public String getServicesSupervises() {
          return servicesSupervises;
     }

     public String getAlertesSeuilSupervisees() {
          return alertesSeuilSupervisees;
     }

     public String getCategoriesAlertes() {
          return categoriesAlertes;
     }

     public String getModelesAlertes() {
          return modelesAlertes;
     }

     public String getPanneauxSupervises() {
          return panneauxSupervises;
     }

     public String getMissionsSupervisees() {
          return missionsSupervisees;
     }

     public String getAnnuairesSupervises() {
          return annuairesSupervises;
     }

     public String getStrategiesRoutageSupervisees() {
          return strategiesRoutageSupervisees;
     }

     public String getProfilsSupervises() {
          return profilsSupervises;
     }

     public String getPlanningsSupervises() {
          return planningsSupervises;
     }

     public String getCommentaires() {
          return commentaires;
     }
}
