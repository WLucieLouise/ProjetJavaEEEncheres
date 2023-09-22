package fr.eni.ecole.projet.controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.modele.bll.UtilisateurManager;
import fr.eni.ecole.projet.modele.bll.UtilisateurManagerImpl;
import fr.eni.ecole.projet.modele.bo.Utilisateur;

/**
 * Servlet implementation class CreationCompteServlet
 */
@WebServlet("/CreationCompte")
public class CreationCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UtilisateurManager utilisateurManager = UtilisateurManagerImpl.getInstance();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creationCompte.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String rue = request.getParameter("rue");
		String code_postal = request.getParameter("code_postal");
		String ville = request.getParameter("ville");
		String motDePasse = request.getParameter("motDePasse");
		String confirmerMotDePasse = request.getParameter("confirmerMotDePasse");
		
		boolean verif = UtilisateurManager.verifMotDePasse(motDePasse, confirmerMotDePasse);
		
		if(verif) {
			Utilisateur utilisateur = utilisateurManager.creerUtilisateur(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, confirm_mot_de_passe);
			request.setAttribute("utilisateur", Utilisateur);
			this.getServletContext().getRequestDispatcher("/creationCompte.jsp").forward(request, response);
		} else {
			request.setAttribute("erreurMdp", "Erreur sur le mot de passe et sa confirmation");
			this.getServletContext().getRequestDispatcher("/creationCompte.jsp").forward(request, response);
		}

	}


		

}
