package main.java.fr.eni.ecole.projet.modele.bo;

import java.time.LocalDate;

public class Article {
	
	private int noArticle ;
	private String nomArticle ;
	private String description ;
	private LocalDate dateDebutEncheres ;
	private LocalDate dateFinEncheres ;
	private int miseAPrix ;
	private int prixVente ;
	private String etatVente ;
	
	
	public Article() {
		
	}
	
	public Article(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres, int miseAPrix, int prixVente, String etatVente) {
		super();
		this.nomArticle = nomArticle;
		this.description = description ;
		this.dateDebutEncheres = dateDebutEncheres ;
		this.dateFinEncheres = dateFinEncheres ;
		this.miseAPrix = miseAPrix ;
		this.prixVente = prixVente ;
		this.etatVente = etatVente ;
	}

	public int getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}

	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}

	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}

	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}

	public int getMiseAPrix() {
		return miseAPrix;
	}

	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}

	public int getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	public String getEtatVente() {
		return etatVente;
	}

	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}
	
	
	
}
