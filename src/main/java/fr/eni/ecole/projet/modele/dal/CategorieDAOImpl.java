package fr.eni.ecole.projet.modele.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projet.modele.bo.Categorie;
import fr.eni.ecole.projet.modele.dal.ConnectionProvider;

public class CategorieDAOImpl implements CategorieDAO {
	
	@Override
	public List<Categorie> recupererCategories() {
		List<Categorie> categories = new ArrayList<>();
		// 1) se connecter à la BDD
				try(Connection cnx = ConnectionProvider.getConnection()) {
					// 2) préparer la requete SQL
					PreparedStatement pstmt = cnx.prepareStatement("SELECT * FROM CATEGORIES");
					
					// 3) exécuter la requete (executeQuery (SELECT) ou executeUpdate (INSERT, UPDATE, DELETE))
					ResultSet rs = pstmt.executeQuery();
					// 4) Traiter les données
					while (rs.next()) {
						Categorie categorie = new Categorie();
						categorie.setNo_categorie(rs.getInt("no_categorie"));
						categorie.setLibelle(rs.getString("libelle"));
						categories.add(categorie);
					}
					// potentiellement récupération de l'id
				//pas le 4	
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return categories;
			}	

}
