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
	@Override
	public boolean verifMotDePasse(String mot_de_passe, String confirm_mot_de_passe) {
		if(confirm_mot_de_passe.equals(confirm_mot_de_passe)) {
			return true;
		}
		return false;
	}
	@Override
	public Utilisateur creerUtilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal,String ville, String mot_de_passe,String confirm_mot_de_passe) {
		Utilisateur utilisateur = new Utilisateur();
		utilisateurDAO.creerUtilisateur(utilisateur);
		return utilisateur;
	}

	@Override
	public Utilisateur verifierConnexion(String pseudo, String mot_de_passe) {
		return utilisateurDAO.veriferConnexion(pseudo, mot_de_passe);
	}

	
	
	
}
