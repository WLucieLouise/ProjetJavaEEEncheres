package fr.eni.ecole.projet.modele.bll;

import fr.eni.ecole.projet.modele.bo.Utilisateur;

public interface UtilisateurManager {
	
	boolean verifMotDePasse(String mot_de_passe, String confirm_mot_de_passe);
		
	Utilisateur creerUtilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String code_postal, String ville, String mot_de_passe);

	Utilisateur verifierConnexion(String pseudo, String mot_de_passe);

}
