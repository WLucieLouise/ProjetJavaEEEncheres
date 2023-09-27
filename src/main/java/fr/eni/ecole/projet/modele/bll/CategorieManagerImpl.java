package fr.eni.ecole.projet.modele.bll;

import java.util.List;

import fr.eni.ecole.projet.modele.bo.Categorie;
import fr.eni.ecole.projet.modele.dal.CategorieDAO;
import fr.eni.ecole.projet.modele.dal.DAOFactory;

public class CategorieManagerImpl implements CategorieManager {
	
	private static CategorieManager categorieManager ;
	
	private CategorieDAO categorieDAO = DAOFactory.getCategorieDAO();
	
	public static CategorieManager getInstance() {
		if(categorieManager == null) {
			categorieManager = new CategorieManagerImpl();
		}
		return categorieManager;
	}
	
	private CategorieManagerImpl() {
		
	}

	@Override
	public List<Categorie> recupererCategories() {
		return categorieDAO.recupererCategories();
	}
	
	

}
