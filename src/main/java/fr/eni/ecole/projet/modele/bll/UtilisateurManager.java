package fr.eni.ecole.projet.modele.bll;

import fr.eni.ecole.projet.modele.bo.Utilisateur;

public interface UtilisateurManager {
	
	boolean verifMotDePasse(String mot_de_passe, String confirm_mot_de_passe);
	
	Utilisateur creerUtilisateur(String nom, String prenom, String email, String mot_de_passe);

	Utilisateur verifierConnexion(String email, String mdp);

}
