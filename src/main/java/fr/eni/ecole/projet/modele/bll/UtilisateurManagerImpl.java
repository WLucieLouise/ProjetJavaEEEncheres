package fr.eni.ecole.projet.modele.bll;

import fr.eni.ecole.projet.modele.dal.DAOFactory;
import fr.eni.ecole.projet.modele.dal.UtilisateurDAO;
import fr.eni.ecole.projet.modele.bo.Utilisateur;

public class UtilisateurManagerImpl implements UtilisateurManager {
	
	private static UtilsateurManager utilisateurManager = null;
	
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
	
	public Utilisateur creerUtilisateur(String nom, String prenom, String email, String mot_de_passe) {
		Utilisateur utilisateur = new Utilisateur(nom, prenom, email, mot_de_passe);
		utilisateurDAO.creerUtilisateur(utilisateur);
		return utilisateur;
	}

	@Override
	public Utilisateur verifierConnexion(String email, String motDePasse) {
		return utilisateurDAO.verifConnection(email, motDePasse);
	}
	
}
