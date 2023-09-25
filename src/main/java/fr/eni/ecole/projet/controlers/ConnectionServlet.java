package fr.eni.ecole.projet.controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.modele.bll.UtilisateurManagerImpl;
import fr.eni.ecole.projet.modele.bll.UtilisateurManager;
import fr.eni.ecole.projet.modele.bo.Utilisateur;


@WebServlet("/Connection")
public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UtilisateurManager utilisateurManager= UtilisateurManagerImpl.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Connection.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo=request.getParameter ("pseudo");
		String mot_de_passe=request.getParameter ("mot_de_passe");
		
		/*System.out.printf(pseudo);
		System.out.printf(mot_de_passe);*/
		
		Utilisateur utilisateur= utilisateurManager.verifierConnexion(pseudo, mot_de_passe);
		
		if(utilisateur.getNoUtilisateur()>0) {
			request.setAttribute("utilisateur", utilisateur);
			this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request, response);
		}else{
			request.setAttribute ("erreur", "Mot de passe ou E-mail incorrect");
			this.getServletContext().getRequestDispatcher("/formulaireConnection.jsp").forward(request,response);
		}
	}

}
