package fr.eni.ecole.projet.modele.dal;

import java.util.List;

//import java.util.List;

import fr.eni.ecole.projet.modele.bo.Categorie;

public interface CategorieDAO {
	
	 List<Categorie> recupererCategories();

}
