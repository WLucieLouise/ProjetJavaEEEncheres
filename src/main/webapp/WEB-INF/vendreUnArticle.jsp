<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Nouvelle vente</h1>
	
	<form action="vente" method="post" enctype="multipart/form-data">
		<label for="nom_article">Nom de l'article :</label>
		<input type="text" id="nom_article" name="nom_article"/><br/>
		
		<label for="description">Description :</label>
		<input type="text" id="description" name="description"/><br/>
				
		<label for="categorie">Catégorie :</label>
		<input type ="text" list="listeChoix" name="categorie" id="categorie">
		<datalist id="listeChoix">
			<c:forEach var="categorie" items="${categories}">
			<option value="${categorie.no_categorie}">${categorie.libelle}</option>
			</c:forEach>
		</datalist> <br/>
		
		<label for="image">Photo de l'article :</label>
		<input type="file" id="image" name="image" accept=" .jpeg, .png, .jpg"> <br/>
		
		<label for="prix_initial">Mise à prix :</label>
		<input type="number" name="prix_initial" id="prix_initial"> <br/>
		
		<label for="date_debut_encheres">Début de l'enchère :</label>
		<input type="date" name="date_debut_encheres" id="date_debut_encheres"> <br/>
		
		<label for="date_fin_encheres">Fin de l'enchère :</label>
		<input type="date" name="date_fin_encheres" id="date_fin_encheres"> <br/>
		 
		 <h2>Retrait</h2> <br/>
		
		<label for="rue">Rue :</label>
		<input type="text" id="rue" name="rue" value=" ${ utilisateur.rue }"/><br/>
		
		<label for="code_postal">Code postal :</label>
		<input type="text" id="code_postal" name="code_postal" value=" ${ utilisateur.code_postal }"/><br/>
		
		<label for="ville">Ville :</label>
		<input type="text" id="ville" name="ville" value=" ${ utilisateur.ville }"/><br/>
		 
		 <input type="submit" value="Enregistrer"/>
		 
	</form>
	
	<p><a href="">Annuler</a></p>

</body>
</html>