package fr.eni.ecole.projet.modele.dal;

import fr.eni.ecole.projet.modele.bo.Utilisateur;

public interface UtilisateurDAO {

	Utilisateur creerUtilisateur (Utilisateur utilisateur);

	Utilisateur majUtilisateur (Utilisateur utilisateur);

	Utilisateur suprimerUtilisateur(Utilisateur utilisateur);

	Utilisateur selectUtilisateur(Utilisateur utilisateur);

	Utilisateur verifierConnexion(String pseudo, String mot_de_passe);
}
