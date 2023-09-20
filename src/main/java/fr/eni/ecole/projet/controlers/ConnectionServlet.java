package fr.eni.ecole.projet.controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.modele.bll.UtilisateurManager;
import fr.eni.ecole.projet.modele.bo.Utilisateur;




@WebServlet("/Connection")
public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Connection.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String identifiant=request.getParameter ("identifiant");
		String mdp=request.getParameter ("mdp");
		
		System.out.printf(identifiant);
		System.out.printf(mdp);
		
		/*Utilisateur utilisateur= UtilisateurManager.verifCnx(identifiant, mdp);
		
		if(utilisateur.getId()>0) {
			request.setAttribute("utilisateur", utilisateur);
			this.getServletContext().getRequestDispatcher("/compte.jsp").forward(request, response);
		}else{
			request.setAttribute ("erreur", "Mot de passe ou E-mail incorrect");
			this.getServletContext().getRequestDispatcher("/formulaireConnection.jsp").forward(request,response);
		}*/
	}

}
