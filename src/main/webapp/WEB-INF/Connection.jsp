<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page connection compte</title>
</head>
<body>
<h1>Connection</h1>

<form action="Connection" method="post">
	<label for="pseudo">Identifiant : </label>
	<input type="text" id="pseudo" name="pseudo"/><br/>
	<label for="mot_de_passe">Mot de Passe: </label>
	<input type="password" id="mot_de_passe" name="mot_de_passe"/> ${erreur}<br/>
	<input type="submit" value="connection"/>
	<a href="creationCompte.jsp"><button>Créer un compte</button></a>
	//partie rappel mdp //se souvenir de moi
</form>

</body>
</html>