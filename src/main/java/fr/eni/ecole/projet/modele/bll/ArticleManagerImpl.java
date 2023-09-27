package fr.eni.ecole.projet.modele.bll;

import java.time.LocalDate;

import fr.eni.ecole.projet.modele.bo.Article;
import fr.eni.ecole.projet.modele.dal.ArticleDAO;
import fr.eni.ecole.projet.modele.dal.DAOFactory;

public class ArticleManagerImpl implements ArticleManager {
	
	private static ArticleManager articleManager = null;
	
	private ArticleDAO articleDAO = DAOFactory.getArticleDAO();

	public static ArticleManager getInstance() {
		if(articleManager == null) {
			articleManager = new ArticleManagerImpl();
		}
		return articleManager;
	}
	private ArticleManagerImpl() {
		
	}
	
	public Article creerNouvelleVente (String nomArticle, String description, String categorie, String miseAPrix, LocalDate dateDebutEncheres,LocalDate dateFinEncheres) {
		Article article = new Article (nomArticle, description, categorie, miseAPrix, dateDebutEncheres, dateFinEncheres);
//		j'appelle la DAO pour créer une nouvelle vente
		DAOFactory.getArticleDAO().creerNouvelleVente(article);
		// je retourne l'article
		return article;
	}

}
