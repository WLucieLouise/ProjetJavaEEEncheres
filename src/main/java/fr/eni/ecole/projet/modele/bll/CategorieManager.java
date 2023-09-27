package fr.eni.ecole.projet.modele.bll;

import java.util.List;

import fr.eni.ecole.projet.modele.bo.Categorie;

public interface CategorieManager {
	
	List<Categorie> recupererCategories();
	
}
