package fr.eni.ecole.projet.modele.dal;

import fr.eni.ecole.projet.modele.bo.Utilisateur;

public interface UtilisateurDAO {

	Utilisateur creerUtilisateur (Utilisateur utilisateur);

	Utilisateur verifConnection(String identifiant, String mdp);

	
}
