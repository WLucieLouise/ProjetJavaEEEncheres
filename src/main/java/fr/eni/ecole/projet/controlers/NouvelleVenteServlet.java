package fr.eni.ecole.projet.controlers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.eni.ecole.projet.modele.bll.ArticleManager;
import fr.eni.ecole.projet.modele.bll.ArticleManagerImpl;
import fr.eni.ecole.projet.modele.bll.CategorieManager;
import fr.eni.ecole.projet.modele.bll.CategorieManagerImpl;
import fr.eni.ecole.projet.modele.bo.Article;
import fr.eni.ecole.projet.modele.bo.Categorie;


@WebServlet("/NouvelleVenteServlet")
public class NouvelleVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ArticleManager articleManager = ArticleManagerImpl.getInstance();
	
	private CategorieManager categorieManager = CategorieManagerImpl.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
//		afficher les catégories		
		List<Categorie> categories = categorieManager.recupererCategories();
		request.setAttribute("categories", categories);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/vendreUnArticle.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomArticle = request.getParameter("nomArticle");
		String description = request.getParameter("description");
		String categorie = request.getParameter("categorie");
		String miseAPrix = request.getParameter("miseAPrix");
		String dateDebutEncheres = request.getParameter("dateDebutEncheres");
		String dateFinEncheres = request.getParameter("dateFinEncheres");

//		créer l'article en BDD
		//Article article = articleManager.creerNouvelleVente(nomArticle, description, categorie, miseAPrix, dateDebutEncheres, dateFinEncheres);
		//request.setAttribute("article", article);
		//this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request, response);
		
	}

 

}