package fr.eni.ecole.projet.modele.bll;

import fr.eni.ecole.projet.modele.dal.DAOFactory;
import fr.eni.ecole.projet.modele.dal.UtilisateurDAO;
import fr.eni.ecole.projet.modele.bo.Utilisateur;

public class UtilisateurManagerImpl implements UtilisateurManager {
	
	private static UtilisateurManager utilisateurManager = null;
	
	private UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO();
	
	public static UtilisateurManager getInstance() {
		if(utilisateurManager == null) {
			utilisateurManager = new UtilisateurManagerImpl();
		}
		return utilisateurManager;
	}
	
	private UtilisateurManagerImpl() {
		
	}
	
	public boolean verifMotDePasse(String motDePasse, String confirmerMotDePasse) {
		if(motDePasse.equals(confirmerMotDePasse)) {
			return true;
		}
		return false;
	}
	
	public Utilisateur creerUtilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal,String ville, String mot_de_passe, int credit, boolean administrateur) {
		Utilisateur utilisateur = new Utilisateur(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur);
		utilisateurDAO.creerUtilisateur(utilisateur);
		return utilisateur;
	}

	@Override
	public Utilisateur verifierConnexion(String email, String motDePasse) {
		return utilisateurDAO.verifierConnexion(email, motDePasse);
	}
	
}
