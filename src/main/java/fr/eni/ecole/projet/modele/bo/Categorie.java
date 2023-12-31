package fr.eni.ecole.projet.modele.bo;

public class Categorie {
	
	private String libelle ;
	private int no_categorie;
	
	public Categorie() {
		
	}
	
	public Categorie(int no_categorie, String libelle) {
		super();
		this.no_categorie = no_categorie;
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public int getNo_categorie() {
		return no_categorie;
	}

	public void setNo_categorie(int no_categorie) {
		this.no_categorie = no_categorie;
	}

	@Override
	public String toString() {
		return "Categorie [no_categorie=" + no_categorie + "libelle=" + libelle + "]";
	}
	
}
