package fr.eni.ecole.projet.modele.bll;

import java.time.LocalDate;

import fr.eni.ecole.projet.modele.bo.Article;

public interface ArticleManager {
	
Article creerNouvelleVente(String nomArticle, String description, String categorie, String miseAPrix, LocalDate dateDebutEncheres,LocalDate dateFinEncheres);

}
