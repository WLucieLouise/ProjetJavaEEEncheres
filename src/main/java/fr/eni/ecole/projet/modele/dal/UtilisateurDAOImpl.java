package main.java.fr.eni.ecole.projet.modele.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.java.fr.eni.ecole.projet.modele.dal.ConnectionProvider;
import main.java.fr.eni.ecole.projet.modele.bo.Utilisateur;

public class UtilisateurDAOImpl implements UtilisateurDAO {

	@Override
	public Utilisateur creerUtilisateur(Utilisateur utilisateur) {

		String bddInsert = "INSERT INTO Utilisateur VALUES (?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = ConnectionProvider.getConnection();) {

			PreparedStatement statement = connection.prepareStatement(bddInsert);
			
			statement.setString(1, utilisateur.getPseudo());
			statement.setString(2, utilisateur.getNom());
			statement.setString(3, utilisateur.getPrenom());
			statement.setString(4, utilisateur.getEmail());
			statement.setString(5, utilisateur.getTelephone());
			statement.setString(6, utilisateur.getRue());
			statement.setString(7, utilisateur.getCodePostal());
			statement.setString(8, utilisateur.getVille());
			statement.setString(9, utilisateur.getMotDePasse());
			statement.setString(10, utilisateur.getCredit());
			statement.setString(11, utilisateur.getAdministrateur());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return utilisateur;

	}
	@Override
	public Utilisateur verifConnection(String identifiant, String mdp) {
		String sqlSelect = "SELECT * FROM Utilisateur WHERE email=? and mot_de_passe=?";
		Utilisateur utilisateur = new Utilisateur();
		try (
				
			Connection connection = ConnectionProvider.getConnection();) {
			
			PreparedStatement statement = connection.prepareStatement(sqlSelect);
			statement.setString(1, identifiant);
			statement.setString(2, mdp);

			ResultSet rs = statement.executeQuery();


			while (rs.next()) {
				utilisateur.setId(rs.getInt("no_utilisateur"));
				utilisateur.setPseudo(rs.getString("pseudo"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setTelephone(rs.getString("telephone"));
				utilisateur.setRue(rs.getInt("rue"));
				utilisateur.setCodePostal(rs.getString("code_postal"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
				utilisateur.setCredit(rs.getString("credit"));
				utilisateur.setAdministrateur(rs.getString("administrateur"));
				
				
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return utilisateur;

	}

}
