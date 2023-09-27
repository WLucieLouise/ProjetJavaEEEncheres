package fr.eni.ecole.projet.modele.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.eni.ecole.projet.modele.bo.Article;
import fr.eni.ecole.projet.modele.bo.Categorie;

public class ArticleDAOImpl implements ArticleDAO{
	
	@Override
	//implémentation de la méthode creerNouvelleVente créee dans ArticleDAO
	public Article creerNouvelleVente(Article article) {
		// connexion à la BDD et fermeture connexion auto
		try (Connection cnx = ConnectionProvider.getConnection()) {
		//requete SQL/PreparedStatement pour éviter les injections
			PreparedStatement pstmt = cnx.prepareStatement("INSERT INTO Article VALUES (?,?,?,?,?,?)");
			pstmt.setString(1, article.getNomArticle());
			pstmt.setString(2, article.getDescription());
			pstmt.setString(3, article.getCategorie());
			pstmt.setInt(4, article.getMiseAPrix());
			pstmt.setDate(5, Date.valueOf(article.getDateDebutEncheres()));
			pstmt.setDate(6, Date.valueOf(article.getDateFinEncheres()));
		//Exécuter la requête
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return article;
	}

}
