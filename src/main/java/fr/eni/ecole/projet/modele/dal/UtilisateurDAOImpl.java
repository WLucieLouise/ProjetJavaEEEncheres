ppackage fr.eni.ecole.projet.modele.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;


import fr.eni.ecole.projet.modele.bo.Utilisateur;

public class UtilisateurDAOImpl implements UtilisateurDAO {

	// INSERT (inscription)
	@Override
	public Utilisateur creerUtilisateur(Utilisateur utilisateur) {

		String bddInsert = "INSERT INTO UTILISATEURS VALUES (?,?,?,?,?,?,?,?,?,?,?)";

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
			statement.setInt(10, utilisateur.getCredit());
			statement.setBoolean(11, utilisateur.isAdministrateur());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return utilisateur;
	}

	// UPDATE (modification profil)
	@Override
	public Utilisateur majUtilisateur(Utilisateur utilisateur) {

		String bddUpdate = " UPDATE UTILISATEUR SET pseudo=? , nom=? , prenom=?, email=?, telephone=? , rue=? , code_postal=?, ville=?, mot_de_passe=?, credit=?, administrateur=? WHERE id=? ";

		try (Connection connection = ConnectionProvider.getConnection();) {

			PreparedStatement statement = connection.prepareStatement(bddUpdate);

			statement.setString(1, utilisateur.getPseudo());
			statement.setString(2, utilisateur.getNom());
			statement.setString(3, utilisateur.getPrenom());
			statement.setString(4, utilisateur.getEmail());
			statement.setString(5, utilisateur.getTelephone());
			statement.setString(6, utilisateur.getRue());
			statement.setString(7, utilisateur.getCodePostal());
			statement.setString(8, utilisateur.getVille());
			statement.setString(9, utilisateur.getMotDePasse());
			statement.setInt(10, utilisateur.getCredit());
			statement.setBoolean(11, utilisateur.isAdministrateur());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return utilisateur;
	}
	
	//SELECT Utilisateur par son numéro
	@Override
	public Utilisateur selectUtilisateur( Utilisateur utilisateur ){

			String bddSelectId= "SELECT * FROM personnes WHERE no_utilisateur=?";
			
			try (Connection connection = ConnectionProvider.getConnection();) {
					

					PreparedStatement statement = connection.prepareStatement(bddSelectId);	

					statement.setInt(1, utilisateur.getNoUtilisateur());
	
					ResultSet result = statement.executeQuery();
					
					// 5. Exploitation des résultats
					Personne personne = new Personne();
					if (result.next())
					{
						Personne p = new Personne(
						result.getString("prenom"),
						result.getString("nom"),
						result.getString("mail"),
						
							);
					//System.out.println(p); la solution fonctionnait mais revois ton affichage
					}
					return personne;

				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
	
	//DELETE (supprimer mon compte)
	@Override
	public Utilisateur suprimerUtilisateur( Utilisateur utilisateur ){
		
		String bddDelete= "DELETE FROM UTILISATEURS WHERE no_utilisateur=?";
		
		try (Connection connection = ConnectionProvider.getConnection();) {
				
				
				PreparedStatement statement = connection.prepareStatement(bddDelete);	

				statement.setInt(1, utilisateur.getNoUtilisateur());

				statement.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace(); 
			}
		return utilisateur; 
		
	}
	

	// SELECT (verification des identifiants pour la connection)
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
				utilisateur.setNoUtilisateur(rs.getInt("no_utilisateur"));
				utilisateur.setPseudo(rs.getString("pseudo"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setTelephone(rs.getString("telephone"));
				utilisateur.setRue(rs.getString("rue"));
				utilisateur.setCodePostal(rs.getString("code_postal"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
				utilisateur.setCredit(rs.getInt("credit"));
				utilisateur.setAdministrateur(rs.getBoolean("administrateur"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return utilisateur;

	}

}
