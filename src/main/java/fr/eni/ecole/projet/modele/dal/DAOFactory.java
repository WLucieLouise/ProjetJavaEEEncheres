package fr.eni.ecole.projet.modele.dal;

public class DAOFactory {

	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOImpl();
	}
	
	public static CategorieDAO getCategorieDAO() {
		return new CategorieDAOImpl();
	}
	
	public static ArticleDAO getArticleDAO() {
		return new ArticleDAOImpl();
	}
	
}
