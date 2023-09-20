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
	<label for="identifiant">Identifiant (Votre E-mail): </label>
	<input type="text" id="identifiant" name="identifiant"/><br/>
	<label for="mdp">Mot de Passe: </label>
	<input type="password" id="mdp" name="mdp"/>${ erreur }<br/>
	<input type="submit" value="connection"/>
	<input type="submit" value="Créer un compte"/>
	//partie rappel mdp //se souvenir de moi
</form>

</body>
</html>