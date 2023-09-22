package fr.eni.ecole.projet.modele.bll;

import fr.eni.ecole.projet.modele.bo.Utilisateur;

public interface UtilisateurManager {
	
	boolean verifMotDePasse(String motDePasse, String confirmerMotDePasse);
	
	Utilisateur creerUtilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal,String ville, String mot_de_passe, int credit, boolean administrateur);

	Utilisateur verifierConnexion(String pseudo, String mdp);

}
