package fr.eni.ecole.projet.modele.bll;

import fr.eni.ecole.projet.modele.dal.DAOFactory;
import fr.eni.ecole.projet.modele.bo.Utilisateur;

public class UtilisateurManagerImpl implements UtilisateurManager {
	
	private static UtilisateurManager utilisateurManager = null;
	
	public static UtilisateurManager getInstance() {
		if(utilisateurManager == null) {
			utilisateurManager = new UtilisateurManagerImpl();
		}
		return utilisateurManager;
	}
	
	private UtilisateurManagerImpl() {
		
	}
	
	public boolean verifMotDePasse(String mot_de_passe, String confirm_mot_de_passe) {
		if(confirm_mot_de_passe.equals(confirm_mot_de_passe)) {
			return true;
		}
		return false;
	}
	
	public Utilisateur creerUtilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal,String ville, String mot_de_passe) {
		Utilisateur utilisateur = new Utilisateur(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, 0, false);
		DAOFactory.getUtilisateurDAO().creerUtilisateur(utilisateur);
		return utilisateur;
	}

	
	public Utilisateur verifierConnexion(String pseudo, String mot_de_passe) {
		return DAOFactory.getUtilisateurDAO().veriferConnexion(pseudo, mot_de_passe);
	}

	
	
	
}
