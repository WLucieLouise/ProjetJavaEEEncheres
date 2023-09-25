<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Création profil</title>
</head>
<body>
	<h2>Création de mon profil</h2>
	<form action="creationCompte" method="post">
		<label for="pseudo">Pseudo : </label>
		<input type="text" id="pseudo" name="pseudo">
		<label for="nom">Nom : </label>
		<input type="text" id="nom" name="nom"><br>
		<label for="prenom">Prénom : </label>
		<input type="text" id="prenom" name="prenom">
		<label for="email">Email : </label><br>
		<input type="email" id="email" name="email"><br>
		<label for="telephone">Téléphone : </label>
		<input type="text" id="telephone" name="telephone">
		<label for="rue">Rue : </label>
		<input type="text" id="rue" name="rue"><br>
		<label for="code_postal">Code postal : </label>
		<input type="text" id="code_postal" name="code_postal">
		<label for="ville">Ville : </label>
		<input type="text" id="ville" name="ville"><br>
		<label for="mot_de_passe">Mot de passe : </label>
		<input type="password" id="mot_de_passe" name="mot_de_passe">
		<label for="confirm_mot_de_passe">Confirmation du mot de passe : </label>
		<input type="password" id="confirm_mot_de_passe" name="confirm_mot_de_passe">${ erreurMdp }<br>
		<input type="submit" value="Créer"/>
		<input type="reset" value="Annuler">
	</form>
</body>
</html>